package com.farmaciascomunales.consultas.service;

import com.farmaciascomunales.consultas.model.ProductoConsulta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {

    public List<ProductoConsulta> obtenerCatalogoMock() {
        return List.of(
                new ProductoConsulta() {{
                    setIdProducto(1L);
                    setNombre("Paracetamol 500mg");
                    setTipo("Analgésico");
                    setPrecio(100);
                    setStockDisponible(25);
                    setBodega("Central");
                }},
                new ProductoConsulta() {{
                    setIdProducto(2L);
                    setNombre("Ibuprofeno 400mg");
                    setTipo("Anti-inflamatorio");
                    setPrecio(200);
                    setStockDisponible(12);
                    setBodega("Sur");
                }}
        );
    }
}