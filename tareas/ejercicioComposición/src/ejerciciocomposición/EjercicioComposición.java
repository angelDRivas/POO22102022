/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocomposición;

import ico.fes.Libros.Libro;
import ico.fes.componentes.Autor;
import ico.fes.componentes.Editorial;
/**
 *
 * @author angel
 */
public class EjercicioComposición {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro lib = new Libro();
        lib.setTitulo("El Principito");
        lib.setGenero("Infantil");
        lib.setPaginas(96);
        Autor autor = new Autor();
        autor.setNombre("Antoine de Saint-Exupéry");
        autor.setEdad(44);
        Editorial editorial = new Editorial();
        editorial.setNombre("Porrúa");
        editorial.setPais("México");
        
        System.out.println( autor );
        System.out.println( lib );
        System.out.println( editorial );
        System.out.println( autor );
        autor.escribir();
        System.out.println( editorial );
        editorial.vender();

    }
    
}
