package com.example.store.service.impl.types;

import com.example.store.model.types.Pc;
import com.example.store.repository.ProductRepository;
import com.example.store.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PcServiceImpl extends ProductServiceImpl<Pc> {

    @Autowired
    public PcServiceImpl(ProductRepository<Pc, Long> productRepository) {
        super(productRepository);
    }
}
