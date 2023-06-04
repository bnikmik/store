package com.example.store.repository.types;

import com.example.store.model.types.Hdd;
import com.example.store.repository.ProductRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HddRepository extends ProductRepository<Hdd, Long> {
}
