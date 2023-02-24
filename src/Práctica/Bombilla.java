package Práctica;

import java.util.Scanner;

public class Bombilla {

    private boolean estado;
    private int potencia;
    private String color;
    private float horas;

    Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Bombilla bombilla1 = new Bombilla(false, 10, "Azul", 10);
        Bombilla bombilla2 = new Bombilla(true, 15, "Amarilla", 2);
        System.out.println(bombilla1.getHoras());
        bombilla1.recargar();
        System.out.println(bombilla1.getHoras());
    }

    public Bombilla(boolean estado, int potencia, String color, float horas) {
        this.estado = estado;
        this.potencia = potencia;
        this.color = color;
        this.horas = horas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    public void encender(){
        if(this.getHoras() > 0){
            this.setEstado(true);
            System.out.println("Ingrese el tiempo que está encendida la bombilla: ");
            float tiempo = teclado.nextFloat();
            this.setHoras(this.getHoras() - tiempo);
        }
    }

    public void apagar(){
        this.setEstado(false);
    }

    public boolean verEstado(){
        return this.isEstado();
    }

    public void cambiaPotencia(int potencia){
        this.setPotencia(potencia);
    }

    public int verPotencia() {
        return this.getPotencia();
    }

    public void cambiaColor (String color) {
        if(this.isEstado()){
            this.apagar();
            this.setColor(color);
        }
    }

    public void verColor () {
        System.out.println(this.getColor());
    }

    public void recargar () {
        System.out.println("Cuántas horas quiere recargar?");
        float horasRecarga = teclado.nextFloat();
        this.setHoras(this.getHoras() + horasRecarga);
    }
}
