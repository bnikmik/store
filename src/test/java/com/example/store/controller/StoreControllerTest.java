package com.example.store.controller;

import com.example.store.model.types.Hdd;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class StoreControllerTest {

    private final Hdd hdd = new Hdd();
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    void setUp() {
        hdd.setId(1L);
        hdd.setSerialNumber("123-123");
        hdd.setProducer("Samsung");
        hdd.setPrice(100);
        hdd.setBalance(5);
        hdd.setCapacity(120);
    }

    @Test
    void addingProductInDatabase_whenAddProduct() throws Exception {
        mockMvc.perform(post("/hdd")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(hdd)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value("1"))
                .andExpect(jsonPath("$.serialNumber").value("123-123"))
                .andExpect(jsonPath("$.producer").value("Samsung"))
                .andExpect(jsonPath("$.price").value("100"))
                .andExpect(jsonPath("$.balance").value("5"))
                .andExpect(jsonPath("$.capacity").value("120"));
    }

    @Test
    void updatingProductInDatabase_whenUpdateProduct() throws Exception {
        addingProductInDatabase_whenAddProduct();
        hdd.setCapacity(256);
        mockMvc.perform(put("/hdd")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(hdd)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value("1"))
                .andExpect(jsonPath("$.serialNumber").value("123-123"))
                .andExpect(jsonPath("$.producer").value("Samsung"))
                .andExpect(jsonPath("$.price").value("100"))
                .andExpect(jsonPath("$.balance").value("5"))
                .andExpect(jsonPath("$.capacity").value("256"));
    }

    @Test
    void gettingProductsFromDatabase_whenGetProductByType() throws Exception {
        addingProductInDatabase_whenAddProduct();
        mockMvc.perform(get("/hdd"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$.length()").value(1));
    }

    @Test
    void gettingProductFromDatabase_whenGetProductById() throws Exception {
        addingProductInDatabase_whenAddProduct();
        mockMvc.perform(get("/hdd/" + hdd.getId()))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value("1"))
                .andExpect(jsonPath("$.serialNumber").value("123-123"))
                .andExpect(jsonPath("$.producer").value("Samsung"))
                .andExpect(jsonPath("$.price").value("100"))
                .andExpect(jsonPath("$.balance").value("5"))
                .andExpect(jsonPath("$.capacity").value("120"));
    }
}