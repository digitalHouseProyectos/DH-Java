package Práctica;
import java.time.LocalDate;

public class Perro {

    private boolean enAdopcion;
    private String raza;
    private int anioNacimiento;
    private double peso;
    private boolean chip;
    private boolean lastimado;
    private String nombre;

    public static void main(String[] args) {
        Perro perro1 = new Perro("Criollo", 2020, 6.0, true, false, "Goofy");
        System.out.println(perro1);
        Perro perro2 = new Perro(2021, 10.0, "Perro2");
        System.out.println(perro2);
        perro2.setLastimado(true);
        System.out.println(perro2);
    }

    public Perro(String raza, int anioNacimiento, double peso, boolean chip, boolean lastimado, String nombre) {
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.chip = chip;
        this.lastimado = lastimado;
        this.nombre = nombre;
        this.enAdopcion =  enAdopcion();
    }

    public Perro(int anioNacimiento, double peso, String nombre) {
        this.raza = "Criollo";
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.nombre = nombre;
        this.enAdopcion =  enAdopcion();
    }

    public boolean isEnAdopcion() {
        return enAdopcion;
    }

    public void setEnAdopcion(boolean enAdopcion) {
        this.enAdopcion = enAdopcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public boolean isLastimado() {
        return lastimado;
    }

    public void setLastimado(boolean lastimado) {
        this.lastimado = lastimado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int edad(){
        LocalDate cd = LocalDate.now();
        int anioActual = cd.getYear();
        int edad = anioActual- getAnioNacimiento();
        return edad;
    }

    public boolean perderse(){
        if(!this.isChip()){
            return false;
        }return true;
    }

    public boolean enAdopcion(){
        if(!this.isLastimado() && this.getPeso() > 5){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {

        String adopcion;
        if(this.enAdopcion()){
            adopcion = "Si";
        }else adopcion = "No";

        return "Nombre: " + this.getNombre() + "\n" +
                "Está en adopción: " + adopcion + "\n" +
                "Raza: " + this.getRaza() + "\n" +
                "Edad: " + this.edad() + "\n" +
                "Peso: " + this.getPeso() + "\n";
    }
}
