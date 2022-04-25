/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author angel
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Plataforma Bancaria");
        System.out.println("Rivas Rodriguez Angel de Jesus           POO      2210");
       
       System.out.println("____________________________________________________________________________________________________");
       System.out.println("Datos de los Cliente: ");
       
       
        
        
        

        
        int [] idCliente = {12303,31429,59145,10475,17778};
        int [] balance = {5000,10540,10000023,49999,786959};
        String [] nombre = {"Mateo","Angel","Justina","Daniel","Carlos"};
        String evaluarNivelCliente = "";
        String mateo    =  ("Nombre: " +nombre[0] + " id: "+ idCliente[0] +  " Tu balance es de: " +balance[0]);
        String angel    =  ("Nombre: " +nombre[1] + " id: "+ idCliente[1] +  " Tu balance es de: " +balance[1]);
        String justina    =  ("Nombre: " +nombre[2] + " id: "+ idCliente[2] +  " Tu balance es de: " +balance[2]);
        String daniel   =  ("Nombre: " +nombre[3] + " id: "+ idCliente[3] +  " Tu balance es de: " +balance[3]);
        String carlos   =  ("Nombre: " +nombre[4] + " id: "+ idCliente[4] +  " Tu balance es de: " +balance[4]);
        
        System.out.println(mateo);
        System.out.println(angel);
        System.out.println(justina);
        System.out.println(daniel);
        System.out.println(carlos);
        System.out.println("____________________________________________________________________________________________________");
        System.out.println("Nivel del Cliente (respectivamente):");   
        
        for (int i:balance){
            if( i >= 50000){
                evaluarNivelCliente ="Cliente Premium" ;
             
            }else{
                evaluarNivelCliente ="Cliente Regular";
            }
            System.out.println(evaluarNivelCliente);
           
        }
         
        
    
       
                
            
      
            
            
        }
            
           
        
      }     

           
         
    