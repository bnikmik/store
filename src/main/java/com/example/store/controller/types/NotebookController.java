package com.example.store.controller.types;

import com.example.store.controller.StoreController;
import com.example.store.model.types.Notebook;
import com.example.store.service.ProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notebook")
@Tag(name = "Ноутбуки")
public class NotebookController extends StoreController<Notebook> {

    @Autowired
    public NotebookController(ProductService<Notebook> service) {
        super(service);
    }
}
