package com.Biblioteca.prestamos.Repositorio;

import com.Biblioteca.prestamos.Entidades.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface estudianteRepositorio extends JpaRepository<Estudiante, String> {
}