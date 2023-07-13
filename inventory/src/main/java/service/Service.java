package service;

public interface Service<T> {

	T create(T t);

	T get(int id) throws Exception;

	boolean delete(int id);
}
