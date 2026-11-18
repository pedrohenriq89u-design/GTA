package com.seduc2.gta.services;

import com.seduc2.gta.entitys.Armas;
import com.seduc2.gta.repositories.ArmasRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmasService {

    private final ArmasRepository repo;

    public ArmasService(ArmasRepository repo) {
        this.repo = repo;
    }

    public List<Armas> mostrarArmas() {
        return repo.findAll();
    }

    public Armas buscarPorId(int id) {
        return repo.findById(id)
                .orElseThrow(() ->
                        new EntityNotFoundException("Arma não encontrada"));
    }

    public void cadastrarArmas(Armas a) {
        repo.save(a);
    }

    @Transactional
    public void alterar(int id, Armas a) {

        Armas armas = buscarPorId(id);

        armas.setNome(a.getNome());
        armas.setCategoria(a.getCategoria());
        armas.setFabricante(a.getFabricante());
        armas.setImagem(a.getImagem());
        armas.setDescricao(a.getDescricao());
    }

    public void deletar(int id) {
        Armas armas = buscarPorId(id);
        repo.delete(armas);
    }
}