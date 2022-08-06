package com.simplesoft.interfaces;

import java.util.List;

public interface IRepository<T extends IModel> {
    List<T> all();
    T show(int id);
    List<T> filter(String key);
    T store(T t);
    T update(T t);
    boolean destroy(int id);
}
