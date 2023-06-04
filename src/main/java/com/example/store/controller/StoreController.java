package com.example.store.controller;

import com.example.store.model.Product;
import com.example.store.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class StoreController<T extends Product> {
    protected final ProductService<T> service;

    public StoreController(ProductService<T> service) {
        this.service = service;
    }

    @Operation(summary = "Добавить продукт")
    @ApiResponse(responseCode = "200", description = "OK", content = @Content)
    @PostMapping()
    public ResponseEntity<?> addProduct(@RequestBody T entity) {
        return ResponseEntity.ok(service.addProduct(entity));
    }

    @Operation(summary = "Обновить продукт")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content),
            @ApiResponse(responseCode = "404", description = "Product not found", content = @Content)
    })
    @PutMapping()
    public ResponseEntity<?> updateProduct(@RequestBody T entity) {
        return ResponseEntity.ok(service.updateProduct(entity));
    }

    @Operation(summary = "Получить все продукты из категории")
    @ApiResponse(responseCode = "200", description = "OK", content = @Content)
    @GetMapping()
    public ResponseEntity<?> getProductByType() {
        return ResponseEntity.ok(service.getProductByType());
    }

    @Operation(summary = "Получить продукт по id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content),
            @ApiResponse(responseCode = "404", description = "Product not found", content = @Content)
    })
    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getProductById(id));
    }

}
