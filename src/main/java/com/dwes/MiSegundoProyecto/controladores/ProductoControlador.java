package com.dwes.MiSegundoProyecto.controladores;

import com.dwes.MiSegundoProyecto.clases.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
public final class ProductoControlador {
    private final Set<Producto> productos = new HashSet<>();
    private int ids = 0;

    @GetMapping("/productos")
    public Set<Producto> getProductos() {
        return productos;
    }

    @PostMapping("/productos/add")
    public boolean addProducto(@RequestBody Producto producto) {
        producto.setId(ids);
        ids++;
        return productos.add(producto);
    }
}
