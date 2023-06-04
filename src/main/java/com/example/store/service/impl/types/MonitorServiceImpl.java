package com.example.store.service.impl.types;

import com.example.store.model.types.Monitor;
import com.example.store.repository.ProductRepository;
import com.example.store.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonitorServiceImpl extends ProductServiceImpl<Monitor> {

    @Autowired
    public MonitorServiceImpl(ProductRepository<Monitor, Long> productRepository) {
        super(productRepository);
    }
}
