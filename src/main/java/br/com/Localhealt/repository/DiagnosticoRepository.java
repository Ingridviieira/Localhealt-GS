package br.com.Localhealt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Localhealt.models.Diagnostico;


public interface DiagnosticoRepository extends JpaRepository<Diagnostico, Long> {

}
