package com.seduc2.gta.services;

import com.seduc2.gta.entitys.Personagem;
import com.seduc2.gta.repositories.PersonagemRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PersonagemService {
    private final PersonagemRepository repo;
    public PersonagemService(PersonagemRepository repo) {
        this.repo = repo;
    }

    public List<Personagem> mostrarPersonagem(){
        return repo.findAll();
    }

    public void cadastrarPersonagem(Personagem p) {
        Personagem personagem = new Personagem();

        personagem.setNome(p.getNome());
        personagem.setDescricao(p.getDescricao());
        personagem.setImagem(p.getImagem());
        personagem.setApelido(p.getApelido());
        personagem.setCategoria(p.getCategoria());
        repo.save(p);
    }
    public void deletar(int id){
        repo.deleteById(id);
    }
    @Transactional
    public void alterar(int id, Personagem p){
        Personagem personagem = repo.getReferenceById(id);
        personagem.setNome(p.getNome());
        personagem.setApelido(p.getApelido());
        personagem.setCategoria(p.getCategoria());
        personagem.setDescricao(p.getDescricao());
        personagem.setImagem(p.getImagem());
    }
}