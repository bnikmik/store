package com.example.store.service;

import com.example.store.model.Product;

import java.util.List;

public interface ProductService<T extends Product> {

    T addProduct(T entity);

    T updateProduct(T entity);

    List<T> getProductByType();

    T getProductById(Long id);

}
