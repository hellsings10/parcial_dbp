package com.example.parcial.store;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long ownerld;

    private String location;
    private String status;

    public Store() {
    }

    public Store(Long id, String name, Long ownerld, String location, String status) {
        this.id = id;
        this.name = name;
        this.ownerld = ownerld;
        this.location = location;
        this.status = status;
    }
}
