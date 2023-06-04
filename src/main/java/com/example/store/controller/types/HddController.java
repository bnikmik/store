package com.example.store.controller.types;

import com.example.store.controller.StoreController;
import com.example.store.model.types.Hdd;
import com.example.store.service.ProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hdd")
@Tag(name = "Жесткие диски")
public class HddController extends StoreController<Hdd> {

    @Autowired
    public HddController(ProductService<Hdd> service) {
        super(service);
    }
}
