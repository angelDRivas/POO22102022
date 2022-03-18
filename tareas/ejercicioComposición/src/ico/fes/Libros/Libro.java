/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.Libros;

import ico.fes.componentes.Autor;
import ico.fes.componentes.Editorial;

/**
 *
 * @author angel
 */
public class Libro {
   private String titulo;
   private String genero;
   private int paginas;
   private Editorial editorial; 
   private Autor autor;

    public Libro() {
    }

    public Libro(String titulo, String genero, int paginas, Editorial editorial, Autor autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = paginas;
        this.editorial = editorial;
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", genero=" + genero + ", paginas=" + paginas + ", editorial=" + editorial + ", autor=" + autor + '}';
    }
    
}
