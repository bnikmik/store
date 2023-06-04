package com.example.store.repository.types;

import com.example.store.model.types.Pc;
import com.example.store.repository.ProductRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PcRepository extends ProductRepository<Pc, Long> {
}
