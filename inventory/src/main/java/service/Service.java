package service;

public interface Service<T> {

    T create(T t);

    T get(int id);

    boolean delete(int id);
}
