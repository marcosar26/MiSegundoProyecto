package com.dwes.MiSegundoProyecto.clases;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public final class Producto {
    private static int ids = 0;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private final int id;
    private final String nombre;
    private final double precio;

    public Producto(String nombre, double precio) {
        this.id = ids++;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto producto)) return false;
        return id == producto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
