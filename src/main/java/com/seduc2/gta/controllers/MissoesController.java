
package com.seduc2.gta.controllers;

import com.seduc2.gta.entitys.Missoes;
import com.seduc2.gta.services.MissoesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/missoes")
public class MissoesController {

    private final MissoesService service;

    public MissoesController(MissoesService service) {
        this.service = service;
    }

    @GetMapping
    public List<Missoes> mostrar() {
        return service.mostrarMissoes();
    }

    @PostMapping
    public void criar(@RequestBody Missoes m) {
        service.cadastrarMissoes(m);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        service.deletar(id);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable int id, @RequestBody Missoes m) {
        service.alterar(id, m);
    }
}

