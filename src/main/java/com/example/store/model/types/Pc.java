package com.example.store.model.types;

import com.example.store.enums.FormFactor;
import com.example.store.model.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Pc extends Product {

    private FormFactor formFactor;
}
