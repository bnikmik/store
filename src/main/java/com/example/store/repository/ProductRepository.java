package com.example.store.repository;

import com.example.store.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ProductRepository<T extends Product, Long> extends JpaRepository<T, Long> {

}
