package br.com.Localhealt.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Localhealt.models.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    Optional<Medico> findByCrm(String Crm);

    Page<Medico> findByCrmContaining(String busca, Pageable pageable);
}
