package com.example.store.repository.types;

import com.example.store.model.types.Notebook;
import com.example.store.repository.ProductRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotebookRepository extends ProductRepository<Notebook, Long> {
}
