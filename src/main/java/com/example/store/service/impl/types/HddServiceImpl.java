package com.example.store.service.impl.types;

import com.example.store.model.types.Hdd;
import com.example.store.repository.ProductRepository;
import com.example.store.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HddServiceImpl extends ProductServiceImpl<Hdd> {

    @Autowired
    public HddServiceImpl(ProductRepository<Hdd, Long> productRepository) {
        super(productRepository);
    }
}
