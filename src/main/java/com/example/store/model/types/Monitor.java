package com.example.store.model.types;

import com.example.store.model.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Monitor extends Product {

    private Float diagonal;
}
