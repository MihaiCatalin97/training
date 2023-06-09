package service;

public interface Service<T> {
    T create(T t);
    T read(int id);
    boolean update(T t);
    boolean delete(int id);
}


