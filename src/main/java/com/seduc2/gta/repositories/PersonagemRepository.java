package com.seduc2.gta.repositories;

import com.seduc2.gta.entitys.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Integer> {

}
