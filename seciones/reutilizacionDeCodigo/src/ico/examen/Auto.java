/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.examen;

/**
 *
 * @author angel
 */
public class Auto {
 private String nombre;
 private String color;
 public int num_puertas;

    public Auto() {
    }

    public Auto(String nombre, String color, int num_puertas) {
        this.nombre = nombre;
        this.color = color;
        this.num_puertas = num_puertas;
    }

    public int getNum_puertas() {
        return num_puertas;
    }

    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }
    
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" + "nombre=" + nombre + ", color=" + color + ", num_puertas=" + num_puertas + '}';
    }
 
 
}
