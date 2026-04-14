package com.biblioteca;
/**
 * Clase que representa un libro dentro del sistema
 * Permite almacenar información básica y gestionar su préstamo
 *
 * @author CarlosCamachoTorres
 * @version 1.0
 * @since 2026
 */
public class Libro {
    private String titulo;
    private String autor;
    private boolean prestado;

    /**
     * Constructor de la clase Libro
     * @param titulo Titulo del libro
     * @param autor Autor del libro
     */
    public Libro (String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }
    /**
     * Marca el libro como prestado
     *
     * @return true si se ha podido prestar, false si ya estaba prestado
     */
    public boolean prestar(){
        if (!prestado){
            prestado = true;
            return true;
        }
        return false;
    }
    /**
     * Devuelve el libro
     */
    public void devolver() {
        prestado = false;
    }

    /**
     * Metodo obsoleto para comprobar estado
     *
     * @deprecated Usa el metodo esta Prestado() en su lugar
     * @return estado del préstamo
     */
    @Deprecated
    public boolean getEstado(){
        return prestado;
    }

    /**
     * Indica si el libro está prestado
     * @return true si está prestado, si no, false
     */
    public boolean estaPrestado(){
        return prestado;
    }
}
