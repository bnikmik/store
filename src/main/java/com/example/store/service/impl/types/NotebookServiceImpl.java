package com.example.store.service.impl.types;

import com.example.store.model.types.Notebook;
import com.example.store.repository.ProductRepository;
import com.example.store.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotebookServiceImpl extends ProductServiceImpl<Notebook> {

    @Autowired
    public NotebookServiceImpl(ProductRepository<Notebook, Long> productRepository) {
        super(productRepository);
    }
}
