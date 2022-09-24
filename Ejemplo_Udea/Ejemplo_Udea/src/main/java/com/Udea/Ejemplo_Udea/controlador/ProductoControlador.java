package com.Udea.Ejemplo_Udea.controlador;

import com.Udea.Ejemplo_Udea.entidades.Producto;
import com.Udea.Ejemplo_Udea.servicios.productoServicio;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class ProductoControlador {

    productoServicio servicio;
    public ProductoControlador(){
        this.servicio=new productoServicio();
    }


    @GetMapping("/LeerProducto")
    public String LeerProducto(){
        Producto p=new Producto("R01","Manzana",5200.45f,50, "Frutas");
        return p.toString();
    }
    @GetMapping("/ListaProductos")
    public ArrayList<Producto>ListaProducto(){
        return this.servicio.getLista();
    }

    @GetMapping("/Consultar1/{posicion}")
    public Producto consultarUno(@PathVariable("posicion") Integer index){
        return this.servicio.buscarProducto(index);
    }

    @PostMapping("/ Insertar")
    public String crearProducto(@RequestBody Producto p) {
        return this.servicio.crearProducto(p);
    }

    @PutMapping("/actualizar/{posicion}")
    public String actualiza(@PathVariable("Posicion") Integer index,@RequestBody Producto p){
        return this.servicio.actualizarProducto(index,p);
        }

    @DeleteMapping("Eliminar/{posicion}")
    public String eliminar(@PathVariable("posicion") Integer index) {
        return this.servicio.eliminarProducto(index);

    }
    }



