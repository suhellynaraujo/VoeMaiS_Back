package br.com.voemais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.voemais.entities.Destino;

@Repository
public interface DestinoRepository extends JpaRepository<Destino, Long>{

}
