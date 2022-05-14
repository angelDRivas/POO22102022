/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Javabasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int edad = 22;
        Integer edad2 = new Integer(2);
        float x = edad2.floatValue();
        System.out.println(x);
        String dias = "23";
        System.out.println((dias + 3));
        int temp = Integer.parseInt(dias);
        edad2.parseInt("33");
        System.out.println("Dias = " + (temp +3 ));
        
        
        
        
        
        Perro dog1 = new Perro("poodle",1);
        Perro dog2 = new Perro("poodle",1);
        Perro dog3 = new Perro("poodle",1);
        System.out.println( dog1 );
        System.out.println( Perro.cola );
        System.out.println(dog1.cola);
        System.out.println(dog2.cola);
        System.out.println(dog3.cola);
        
        Perro.ladrar();
        dog1.ladrar();
        
        String cad1 = "Hola ";
        String cad2 = "Mundo ";
        String cad3 = cad1 + cad2;
        System.out.println( cad3);
        System.out.println("Edad :" + edad + " años" );
        
        String res = "";
        
        edad = 15;
        if (edad >= 18) {
            res = "Mayor de edad";
        }else{
            res = "Menos de edad";
        }
        
        System.out.println("Eres : " + res );
        
        System.out.println("--------");
        
        res = (edad >= 18)?"Mayor de edad":"Menos de edad";
        System.out.println("Eres : " + res);
        
        int  val1 = 7;
        int  val2 = 2;
        System.out.println( val1 | val2);
        System.out.println( val1 & val2);
        
        /*
        val1 = 000...0111
        and
        val2 = 000...0010
        ------------------
               000...0010    // 2 decimal
        */ 
        // desplazamiento a nivel de bits
        
        int val3 = 1; // 000...0001
        int val4 = val3<<1; // desplazar los bit una posicion a la IZQ
                             // 000...0010
        System.out.println(val4);
        val4 = val4<<1;
        System.out.println(val4);
        
        System.out.println("--- arreglos ---");
        
        int [] edades; // aqui solo se declara
        int [] edades2 = new  int[5]; // aqui se declara y reserva memoria
        int [] edades3 = {22,21,18,19,18}; // en este, se declara, reserva e inicializa
        
        /*
        Ahora, se usa igual como en leg C, C++, Python... etc
        */
        edades2[0]=33;
        System.out.println( edades2[0] ); // 33
        System.out.println( edades2[1]); // 0
                
        // ahora imprimimos las edades3
        System.out.println("Edades 3 a mano:");
        System.out.println( edades3[0] );  //
        System.out.println( edades3[1] );  //
        System.out.println( edades3[2] );  //
        System.out.println( edades3[3] );  //
        System.out.println( edades3[4] );  //
        
        //ahora, lo combinamos con FOR
        System.out.println("Automatizado");
        for (int i = 0; i < edades3.length; i++) {
            System.out.println(edades3[i]);
        }
        //Orden inverso
        System.out.println("--------------------");
        for (int j = 4; j >= 0; j = j -1) {
            System.out.println(edades3[j]);
        }
        System.out.println("Otra forma");
        
        System.out.println("orden inverso ");
        for (int i = edades3.length-1; i >= 0; i--) {
            System.out.println(edades3[i]);
        }
        
        System.out.println("edades a 18");
        for (int i = 0; i < edades3.length; i++) {
            edades3[i] = edades3[2];
            System.out.println(edades3[i]);
            System.out.println("con for each");
        for(int ed: edades3){
            System.out.println(ed);
        }
        
        System.out.println("Automatizado");
        for (int j = 0; j < edades3.length; j++) {
            System.out.println(edades3[j]);
        
        }
        System.out.println("Arreglo de la clase perro");
        
        Perro [] lista = new Perro[3];
        lista[0] = new Perro("Poodle",1);
        lista[1] = new Perro("Poodle",1);
        lista[2] = new Perro("Poodle",1);
        
        for (Perro perro : lista) {
            perro.comer();
        }
        
        System.out.println("Todos los perros doverman");
        for (Perro perro : lista) {
            perro.setRaza("Doverman");
        }
        for (Perro perro : lista) {
            System.out.println(perro);
        }
        }
        
        System.out.println("------ArrayLIst-----");
        //ArrayList de la clase perro
        ArrayList mascotas = new ArrayList();
        mascotas.add(new Perro("Poodle",1));
        mascotas.add(new Perro("Doverman",1));
        mascotas.add(new Perro("Akita",1));
        mascotas.add(new Perro("Gran Danes",1));
        mascotas.add(new Perro("Chihuahua",1));
        
        for(Object mascota : mascotas){
            Perro tmp = (Perro)mascota;
            System.out.println(tmp);
        }
        //Despues de la version 2 de java se agrego el concepto de clases 
          
        ArrayList <Perro>mascotas2 = new ArrayList();
        mascotas2.add(new Perro("Poodle",1));
        mascotas2.add(new Perro("Doverman",1));
        mascotas2.add(new Perro("Akita",1));
        mascotas2.add(new Perro("Gran Danes",1));
        mascotas2.add(new Perro("Chihuahua",1));
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Que raza quieres cambiar?");
        String raza = "Akita";
        
        
        for(Perro perro : mascotas2){
            if(perro.getRaza().equals("Akita")){
            perro.setTamano(4);
        }
            
        }
        System.out.println("-----------------");
        System.out.println("Perro 2 es:"+ mascotas2.get(2));
        System.out.println("'Eliminar el akita, index 3");
        Perro p = mascotas2.remove(3);
         for(Perro perro : mascotas2){
             System.out.println(perro);
         }
        System.out.println("---------");
        System.out.println("Perro sacado es:" + p);
        mascotas2.set(1, new Perro("Boxer",3));
        mascotas2.set(1, new Perro("Labrador",4));
        System.out.println("----------");
        for(Perro perro : mascotas2){
            System.out.println(perro);
        }
        
        System.out.println("Elige un numero entre 0 y 4");
        int indice = teclado.nextInt();
        Perro puppy = null;
        float num = 10.0f;
        try{
         puppy = mascotas2.get(indice);
         num = num/(float)indice;
        System.out.println(mascotas2.get(indice));
        }catch(IndexOutOfBoundsException ex){
            System.out.println("Ocurrio un error"); 
           System.out.println("Ocurrio un error, el valor debe estar entre cero y cuatro");
           puppy = mascotas2.get(0);
            System.out.println(ex);
        }catch(InputMismatchException ime){
            System.out.println("Solo deben ser numeros");
            puppy = mascotas2.get(0);
        }catch(Exeption e){
            System.out.println("Ultimo recurso");
        }finally{
            System.out.println("En finally");
            System.out.println(puppy);
        }
        
        
        //ERROR != EXEPCION
        System.out.println("Se alcanzo el fin del programa!!");
        
        
        }


    }
      
      
        
 
