package com.bilgeadam.utility;

import java.util.List;
import java.util.Optional;

public interface ICrud<T, ID> extends IMyRepository<T, ID> {

	<S extends T> S save(S entity); // verilen entity nesnesi kayýt edilecek

	<S extends T> Iterable<S> save(Iterable<S> entities); // bir liste þeklinde nesneleri göndererek kayýt edebiliriz.

	void deleteById(ID id); // generic olarak verilen ID nin tipine göre id iletilerek silme iþlemi yapýlýr.

	void delete(T entity); // nesnenin kendisi verilerek kayýt silinir.

	Optional<T> findById(ID id); // id ye göre iligili kayýt optional olarak döner

	boolean existById(ID id); // id si veilen kayýt ýn olup olmadýðý dönülür (true/false)

	List<T> findAll(); // tüm kayýtlarý listeler

	List<T> findByColumnAndValue(String column, Object value); // kolon ve deðeri verilen kayýtlarý eþleþtirelek
																// listeler

	List<T> findByEntity(T entity); // nesnenin kendisi sorgulama yapýlacak alanlarý ile doldurularak iþlenir.
}
