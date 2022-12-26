package com.bilgeadam.utility;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MyRepository<T, ID> implements ICrud<T, ID> {

	private Session ss;
	private EntityManager entityManager;
	private CriteriaBuilder criteriaBuilder;
	private Transaction tt;
	private T t;

	public MyRepository(T t) {
		entityManager = HibernateUtils.getFactory().createEntityManager();
		criteriaBuilder = entityManager.getCriteriaBuilder();
		this.t = t;
	}

	public void openSession() {
		ss = HibernateUtils.getFactory().openSession();
		tt = ss.beginTransaction();
	}

	public void closeSession() {
		tt.commit();
		ss.close();
	}

	public void closeErrorSession() {
		tt.rollback();
		ss.close();
	}

	public <S extends T> S save(S entity) {
		try {
			openSession();
			ss.save(entity);
			closeSession();
			return entity;
		} catch (Exception e) {
			closeErrorSession();
			System.out.println("Kaydetme hatasý: " + e.toString());
		}
		return null;
	}

	public <S extends T> Iterable<S> save(Iterable<S> entities) {
		try {
			openSession();
			entities.forEach(entity -> {
				ss.save(entity);
			});
			closeSession();
			return entities;
		} catch (Exception e) {
			closeErrorSession();
			System.out.println("Kaydetme hatasý: " + e.toString());
		}
		return null;
	}

	public void deleteById(ID id) {
		T deleteEntity = null;
		CriteriaQuery<T> criteriaQuery = (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
		Root<T> root = (Root<T>) criteriaQuery.from(t.getClass());
		criteriaQuery.select(root);
		criteriaQuery.where(criteriaBuilder.equal(root.get("id"), id));
		List<T> list = entityManager.createQuery(criteriaQuery).getResultList();
		if (!list.isEmpty()) {
			deleteEntity = (T) list.get(0);
			try {
				openSession();
				ss.delete(deleteEntity);
				closeSession();
			} catch (Exception e) {
				closeErrorSession();
				System.out.println("Silme hatasý: " + e.toString());
			}
		}

	}

	public void delete(T entity) {
		try {
			openSession();
			ss.delete(entity);
			closeSession();
		} catch (Exception e) {
			closeErrorSession();
			System.out.println("Kaydetme hatasý: " + e.toString());
		}

	}

	public Optional<T> findById(ID id) {
		CriteriaQuery<T> criteriaQuery = (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
		Root<T> root = (Root<T>) criteriaQuery.from(t.getClass());
		criteriaQuery.select(root);
		criteriaQuery.where(criteriaBuilder.equal(root.get("id"), id));
		List<T> list = entityManager.createQuery(criteriaQuery).getResultList();
		if (!list.isEmpty()) {
			return Optional.of(list.get(0));
		}
		return Optional.empty();
	}

	public boolean existById(ID id) {
		try {
			CriteriaQuery<T> criteriaQuery = (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
			Root<T> root = (Root<T>) criteriaQuery.from(t.getClass());
			criteriaQuery.select(root);
			criteriaQuery.where(criteriaBuilder.equal(root.get("id"), id));
			List<T> list = entityManager.createQuery(criteriaQuery).getResultList();
			return !list.isEmpty();
		} catch (Exception e) {
			return false;
		}

	}

	public List<T> findAll() {
		CriteriaQuery<T> criteriaQuery = (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
		Root<T> root = (Root<T>) criteriaQuery.from(t.getClass());
		criteriaQuery.select(root);

		return entityManager.createQuery(criteriaQuery).getResultList();
	}

	public List<T> findByColumnAndValue(String column, Object value) {
		CriteriaQuery<T> criteriaQuery = (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
		Root<T> root = (Root<T>) criteriaQuery.from(t.getClass());
		criteriaQuery.select(root);
		criteriaQuery.where(criteriaBuilder.equal(root.get(column), value));
		return entityManager.createQuery(criteriaQuery).getResultList();
	}

	public List<T> findByEntity(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
