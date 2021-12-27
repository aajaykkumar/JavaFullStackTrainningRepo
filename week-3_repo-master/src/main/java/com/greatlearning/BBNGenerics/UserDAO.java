package com.greatlearning.BBNGenerics;

import java.util.List;

public interface UserDAO<T> {

	T get(String email);
    
    List<T> getAll();
    
    void save(T t);
    
    void update(T t);
    
    void delete(T t);
}
