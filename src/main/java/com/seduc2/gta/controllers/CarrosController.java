
package com.seduc2.gta.controllers;

import com.seduc2.gta.entitys.Carros;
import com.seduc2.gta.services.CarrosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/carros")
public class CarrosController {

    private final CarrosService service;

    public CarrosController(CarrosService service) {
        this.service = service;
    }

    @GetMapping
    public List<Carros> mostrar() {
        return service.mostrarCarros();
    }

    @PostMapping
    public void criar(@RequestBody Carros c) {
        service.cadastrarCarros(c);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        service.deletar(id);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable int id, @RequestBody Carros c) {
        service.alterar(id, c);
    }
}
