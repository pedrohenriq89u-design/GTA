package com.seduc2.gta.controllers;

import com.seduc2.gta.entitys.Armas;
import com.seduc2.gta.services.ArmasService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/armas")
public class ArmasController {

    private final ArmasService service;

    public ArmasController(ArmasService service) {
        this.service = service;
    }

    @GetMapping
    public List<Armas> mostrar() {
        return service.mostrarArmas();
    }

    @GetMapping("/{id}")
    public Armas buscar(@PathVariable int id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public void criar(@RequestBody Armas a) {
        service.cadastrarArmas(a);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable int id, @RequestBody Armas a) {
        service.alterar(id, a);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        service.deletar(id);
    }
}