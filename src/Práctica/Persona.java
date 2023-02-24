package Práctica;

import java.io.IOException;
import java.util.Scanner;

public class Persona {


    private String nombre;
    private int edad;
    private int DNI;
    private final static char M = 'M';
    private char sexo;
    private double peso;
    private double altura;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Edad: ");
        int edad = teclado.nextInt();
        System.out.println("Sexo: ");
        char sexo = 0;
        try {
            sexo = (char)System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Peso: ");
        double peso = teclado.nextDouble();
        System.out.println("Altura: ");
        double altura = teclado.nextDouble();
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        System.out.println(persona1.toString());
    }

    public Persona (){
        nombre = "";
        edad = 0;
        sexo = M;
        peso = 0;
        altura = 0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = sexo;
        comprobarSexo();
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int calcularIMC(){
        double imc = (this.getPeso()/(this.getAltura()*this.getAltura()));
        System.out.println(imc);
        final int pesoIdeal = 0;
        final int debajoPesoIdeal = -1;
        final int sobrepeso = 1;
        if(imc < 20){
            return debajoPesoIdeal;
        }else if(imc >= 20 && imc <= 25){
            return pesoIdeal;
        }else return sobrepeso;
    }

    public boolean isMayorEdad(){
        if(this.edad >= 18) return true;
        return false;
    }

    public void comprobarSexo(){
        if(this.getSexo() != 'M' && this.getSexo() != 'F'){
            this.setSexo(M);
        }
    }

    @Override
    public String toString(){
        String sexo;
        if(this.getSexo() == 'M'){
            sexo = "Hombre";
        }else sexo = "Mujer";
        return "Información de la persona:\n"
                + "Nombre: " + this.getNombre() + "\n"
                + "Sexo: " + sexo + "\n"
                + "DNI: " + this.getDNI() + "\n"
                + "Peso: " + this.getPeso() + "\n"
                + "Altura: " + this.getAltura() + " metros";
    }

    public int generaDNI() {
        int DNI = (int)(Math.random()*123456789)+1;
        return DNI;
    }
}
