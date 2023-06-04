package com.example.store.controller.types;

import com.example.store.controller.StoreController;
import com.example.store.model.types.Pc;
import com.example.store.service.ProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pc")
@Tag(name = "Настольные компьютеры")
public class PcController extends StoreController<Pc> {

    @Autowired
    public PcController(ProductService<Pc> service) {
        super(service);
    }
}
