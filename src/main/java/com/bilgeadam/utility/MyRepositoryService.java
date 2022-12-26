package com.bilgeadam.utility;

import java.util.List;
import java.util.Optional;

public class MyRepositoryService<R extends MyRepository, T, ID> implements ICrud<T, ID> {

	R repository;

	public MyRepositoryService(R repository) {

		this.repository = repository;
	}

	@Override
	public <S extends T> S save(S entity) {

		return (S) repository.save(entity);
	}

	@Override
	public <S extends T> Iterable<S> save(Iterable<S> entities) {

		return repository.save(entities);
	}

	@Override
	public void deleteById(ID id) {
		repository.deleteById(id);

	}

	@Override
	public void delete(T entity) {
		repository.delete(entity);
	}

	@Override
	public Optional<T> findById(ID id) {

		return repository.findById(id);
	}

	@Override
	public boolean existById(ID id) {

		return repository.existById(id);
	}

	@Override
	public List<T> findAll() {

		return repository.findAll();
	}

	@Override
	public List<T> findByColumnAndValue(String column, Object value) {

		return repository.findByColumnAndValue(column, value);
	}

	@Override
	public List<T> findByEntity(T entity) {

		return repository.findByEntity(entity);
	}

}