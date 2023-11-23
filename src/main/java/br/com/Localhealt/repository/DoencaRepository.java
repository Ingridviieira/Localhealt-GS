package br.com.Localhealt.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Localhealt.models.Doenca;


public interface DoencaRepository extends JpaRepository<Doenca, Long> {
    Page<Doenca> findByNmDoencaContaining(String busca, Pageable pageable);
}
