package com.example.store.repository.types;

import com.example.store.model.types.Monitor;
import com.example.store.repository.ProductRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitorRepository extends ProductRepository<Monitor, Long> {
}
