package com.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona una colección de libros.
 * Permite añadir, buscar y prestar libros.
 *
 * @author CarlosCamachoTorres
 * @version 1.0
 * @since 2026
 */
public class Biblioteca {

    private String nombre;
    private List<Libro> libros;

    /**
     * Constructor de la biblioteca.
     *
     * @param nombre Nombre de la biblioteca
     */
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    /**
     * Añade un libro a la biblioteca.
     *
     * @param libro Libro a añadir
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    /**
     * Busca un libro por título.
     *
     * @param titulo Título del libro a buscar
     * @return Libro encontrado o null si no existe
     */
    public Libro buscarLibro(String titulo) {
        for (Libro l : libros) {
            if (l != null && titulo.equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }

    /**
     * Presta un libro.
     *
     * @param titulo Título del libro
     * @return true si se prestó correctamente
     * @throws Exception si el libro no existe
     */
    public boolean prestarLibro(String titulo) throws Exception {
        Libro libro = buscarLibro(titulo);

        if (libro == null) {
            throw new Exception("Libro no encontrado");
        }

        return libro.prestar();
    }
}