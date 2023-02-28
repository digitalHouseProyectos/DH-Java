package Clase6;

import java.time.LocalDate;

public class Perros {

    private boolean enAdopcion;
    private String raza;
    private int anioNacimiento;
    private double peso;
    private boolean tieneChip;
    private boolean estaLastimado;
    private String nombre;

    public Perros() {
    }

    public Perros(String raza, int anioNacimiento, double peso, boolean tieneChip, boolean estaLastimado, String nombre) {
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        this.nombre = nombre;
        this.enAdopcion = estaEnAdopcion();
    }

    public Perros(int anioNacimiento, double peso, String nombre) {
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.nombre = nombre;
        this.enAdopcion = estaEnAdopcion();
        this.raza = "Criollito";
        this.tieneChip = false;
        this.estaLastimado = false;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public boolean isEstaLastimado() {
        return estaLastimado;
    }

    public void setEstaLastimado(boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    public int edad(){
        LocalDate fechaActual = LocalDate.now();
        int anioActual = fechaActual.getYear();
        int edad = anioActual - anioNacimiento;
        return edad;
    }

    public boolean puedePerderse(){
        return !tieneChip;
    }

    public boolean estaEnAdopcion(){
        return !estaLastimado && peso > 5;
    }

    @Override
    public String toString() {
        String adop;
        if(estaEnAdopcion()){
            adop = "Si";
        }else adop = "No";
        return "Perros{" +
                "Nombre='" + nombre + '\'' +
                ", Edad='" + edad() + '\'' +
                ", en Adopcion=" + adop +
                ", Raza='" + raza + '\'' +
                '}';
    }
}
