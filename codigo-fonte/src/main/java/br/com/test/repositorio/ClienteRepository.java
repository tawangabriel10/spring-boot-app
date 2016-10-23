package br.com.test.repositorio;

import br.com.test.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository
            extends RevisionRepository<Cliente, Long, Integer>,  JpaRepository<Cliente, Long> {

}
