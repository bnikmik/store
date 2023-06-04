package com.example.store.controller.types;

import com.example.store.controller.StoreController;
import com.example.store.model.types.Monitor;
import com.example.store.service.ProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monitor")
@Tag(name = "Мониторы")
public class MonitorController extends StoreController<Monitor> {

    @Autowired
    public MonitorController(ProductService<Monitor> service) {
        super(service);
    }
}
