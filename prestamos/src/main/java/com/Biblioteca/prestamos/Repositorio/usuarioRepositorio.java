package com.Biblioteca.prestamos.Repositorio;

import com.Biblioteca.prestamos.Entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usuarioRepositorio extends JpaRepository<Usuario, Long> {

    Usuario findByEmail(String email);
}