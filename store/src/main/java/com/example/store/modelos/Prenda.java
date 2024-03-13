package com.example.store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="prendas")
public class Prenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nombre;



}
