package com.Biblioteca.prestamos.Repositorio;

import com.Biblioteca.prestamos.Entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface libroRepositorio extends JpaRepository<Libro, String> {

    ArrayList<Libro> findByAutor(String autor);
}