package com.example.store.service.impl;

import com.example.store.exception.NotFoundException;
import com.example.store.model.Product;
import com.example.store.repository.ProductRepository;
import com.example.store.service.ProductService;

import java.util.List;
import java.util.Optional;


public abstract class ProductServiceImpl<T extends Product> implements ProductService<T> {

    private final ProductRepository<T, Long> productRepository;

    public ProductServiceImpl(ProductRepository<T, Long> productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public T addProduct(T entity) {
        entity.setId(null);
        return productRepository.save(entity);
    }

    @Override
    public T updateProduct(T entity) {
        Optional<T> optional = productRepository.findById(entity.getId());
        if (optional.isPresent()) {
            return productRepository.save(entity);
        } else {
            throw new NotFoundException();
        }
    }

    @Override
    public List<T> getProductByType() {
        return productRepository.findAll();
    }

    @Override
    public T getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(NotFoundException::new);
    }
}
