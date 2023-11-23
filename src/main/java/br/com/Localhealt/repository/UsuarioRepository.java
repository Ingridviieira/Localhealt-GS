package br.com.Localhealt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Localhealt.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    Optional<Usuario> findByEmail(String email);
}

