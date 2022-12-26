package com.bilgeadam.utility;

import java.util.List;
import java.util.Optional;

public interface ICrud<T, ID> extends IMyRepository<T, ID> {

	<S extends T> S save(S entity); // verilen entity nesnesi kay�t edilecek

	<S extends T> Iterable<S> save(Iterable<S> entities); // bir liste �eklinde nesneleri g�ndererek kay�t edebiliriz.

	void deleteById(ID id); // generic olarak verilen ID nin tipine g�re id iletilerek silme i�lemi yap�l�r.

	void delete(T entity); // nesnenin kendisi verilerek kay�t silinir.

	Optional<T> findById(ID id); // id ye g�re iligili kay�t optional olarak d�ner

	boolean existById(ID id); // id si veilen kay�t �n olup olmad��� d�n�l�r (true/false)

	List<T> findAll(); // t�m kay�tlar� listeler

	List<T> findByColumnAndValue(String column, Object value); // kolon ve de�eri verilen kay�tlar� e�le�tirelek
																// listeler

	List<T> findByEntity(T entity); // nesnenin kendisi sorgulama yap�lacak alanlar� ile doldurularak i�lenir.
}
