/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author angel
 */
public class Alumno extends Persona{
    private String numeroCuenta;
    private String carera;
    private int semestre;

    public Alumno() {
    }

    public Alumno(String numeroCuenta, String carera, int semestre) {
        this.numeroCuenta = numeroCuenta;
        this.carera = carera;
        this.semestre = semestre;
    }

    public Alumno(String numeroCuenta, String carera, int semestre, String nombre, int edad) {
        super(nombre, edad);
        this.numeroCuenta = numeroCuenta;
        this.carera = carera;
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCarera() {
        return carera;
    }

    public void setCarera(String carera) {
        this.carera = carera;
    }

    @Override
    public String toString() {
        return super.toString()+ "Alumno{" + "numeroCuenta=" + numeroCuenta + ", carera=" + carera + ", semestre=" + semestre + '}';
    }

    
    
}
