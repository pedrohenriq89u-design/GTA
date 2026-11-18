
package com.seduc2.gta.services;

import com.seduc2.gta.entitys.Carros;
import com.seduc2.gta.repositories.CarrosRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrosService {

    private final CarrosRepository repo;

    public CarrosService(CarrosRepository repo) {
        this.repo = repo;
    }

    public List<Carros> mostrarCarros() {
        return repo.findAll();
    }

    public void cadastrarCarros(Carros c) {
        Carros carros = new Carros();

        carros.setNomeveiculo(c.getNomeveiculo());
        carros.setMarca(c.getMarca());
        carros.setCategoria(c.getCategoria());
        carros.setUrldaimagem(c.getUrldaimagem());
        carros.setDescricao(c.getDescricao());

        repo.save(carros);
    }

    public void deletar(int id) {
        repo.deleteById(id);
    }

    @Transactional
    public void alterar(int id, Carros c) {
        Carros carros = repo.getReferenceById(id);

        carros.setNomeveiculo(c.getNomeveiculo());
        carros.setMarca(c.getMarca());
        carros.setCategoria(c.getCategoria());
        carros.setUrldaimagem(c.getUrldaimagem());
        carros.setDescricao(c.getDescricao());
    }
}
