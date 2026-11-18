
package com.seduc2.gta.services;

import com.seduc2.gta.entitys.Missoes;
import com.seduc2.gta.repositories.MissoesRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {

    private final MissoesRepository repo;

    public MissoesService(MissoesRepository repo) {
        this.repo = repo;
    }

    public List<Missoes> mostrarMissoes() {
        return repo.findAll();
    }

    public void cadastrarMissoes(Missoes m) {
        Missoes missoes = new Missoes();

        missoes.setNomemissao(m.getNomemissao());
        missoes.setLocal(m.getLocal());
        missoes.setDificuldade(m.getDificuldade());
        missoes.setUrldaimagem(m.getUrldaimagem());
        missoes.setDescricaoobjetivo(m.getDescricaoobjetivo());

        repo.save(missoes);
    }

    public void deletar(int id) {
        repo.deleteById(id);
    }

    @Transactional
    public void alterar(int id, Missoes m) {
        Missoes missoes = repo.getReferenceById(id);

        missoes.setNomemissao(m.getNomemissao());
        missoes.setLocal(m.getLocal());
        missoes.setDificuldade(m.getDificuldade());
        missoes.setUrldaimagem(m.getUrldaimagem());
        missoes.setDescricaoobjetivo(m.getDescricaoobjetivo());
    }
}
