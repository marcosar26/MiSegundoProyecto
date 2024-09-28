package com.dwes.MiSegundoProyecto.controladores;

import com.dwes.MiSegundoProyecto.clases.Pedido;
import com.dwes.MiSegundoProyecto.clases.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
public class PedidoControlador {
    private final Set<Pedido> pedidos = new HashSet<>();

    @GetMapping("/pedidos")
    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    @PostMapping("/pedidos/add")
    public boolean addPedidos(@RequestBody Set<Producto> productos) {
        Pedido pedido = new Pedido(productos);
        return pedidos.add(pedido);
    }
}
