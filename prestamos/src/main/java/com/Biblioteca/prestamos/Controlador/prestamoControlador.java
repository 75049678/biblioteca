package com.Biblioteca.prestamos.Controlador;

import com.Biblioteca.prestamos.Entidades.Prestamo;
import com.Biblioteca.prestamos.Servicios.prestamoServicio;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class prestamoControlador {

    prestamoServicio servicio;

    public prestamoControlador(prestamoServicio servicio) {
        this.servicio = servicio;
    }

    @PostMapping("/AgregarPrestamo/{isbn}/{doc}")
    public Prestamo agregarPrestamo(@PathVariable("isbn") String isbn, @PathVariable("doc") String doc,
                                    @RequestBody Prestamo prestamo){
        return servicio.agregarPrestamo(isbn,doc,prestamo);
    }

    @GetMapping("/porEstudiante/{doc}")
    public ArrayList<Prestamo> porEstudiante(@PathVariable("doc") String doc){
        return servicio.porEstudiante(doc);
    }
}
