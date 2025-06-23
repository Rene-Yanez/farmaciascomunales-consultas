package com.farmaciascomunales.consultas.controller;

import com.farmaciascomunales.consultas.model.ProductoConsulta;
import com.farmaciascomunales.consultas.service.ConsultaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    private final ConsultaService service;

    public ConsultaController(ConsultaService service) {
        this.service = service;
    }

    @GetMapping("/productos")
    public List<ProductoConsulta> obtenerCatalogo() {
        return service.obtenerCatalogoMock();
    }
}