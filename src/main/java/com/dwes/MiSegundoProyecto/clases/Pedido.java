package com.dwes.MiSegundoProyecto.clases;

import java.util.Objects;
import java.util.Set;

public final class Pedido {
    private static int ids = 0;
    private final int id;
    private final Set<Producto> productos;
    private final double precio;

    public Pedido(Set<Producto> productos) {
        this.id = ids++;
        this.productos = productos;
        this.precio = productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    public int getId() {
        return id;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", productos=" + productos +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pedido pedido)) return false;
        return id == pedido.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
