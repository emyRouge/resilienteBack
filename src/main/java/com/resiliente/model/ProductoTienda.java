package com.resiliente.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "producto_tienda")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductoTienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProductoTienda")
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "descripcion", nullable = false, columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "precio", nullable = false, precision = 10, scale = 2)
    private BigDecimal precio;

    @Column(name = "categoria", length = 50)
    private String categoria;

    @Column(name = "imagen", columnDefinition = "TEXT")
    private String imagen; // Cambiado de byte[] a String para URL

    @Column(name = "descuento", precision = 5, scale = 2)
    private BigDecimal descuento;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion;

    @Column(name = "status", nullable = false, columnDefinition = "TINYINT DEFAULT 1")
    private Boolean status = true;

    @Column(name = "caracteristicas", columnDefinition = "TEXT")
    private String caracteristicas;
}