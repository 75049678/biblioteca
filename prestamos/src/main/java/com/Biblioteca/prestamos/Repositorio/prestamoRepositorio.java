package com.Biblioteca.prestamos.Repositorio;

import com.Biblioteca.prestamos.Entidades.Estudiante;
import com.Biblioteca.prestamos.Entidades.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface prestamoRepositorio extends JpaRepository<Prestamo,Integer> {

    ArrayList<Prestamo> findByEstudiante(Estudiante estudiante);
}