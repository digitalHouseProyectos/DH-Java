package Clase4;

import java.util.Scanner;

public class Bombilla {

    private boolean estado = false;
    private int potencia;
    private String color;
    private float horas = 10;
    Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Bombilla bombilla = new Bombilla(false, 10, "Amarilla", 10);
        System.out.println(bombilla.ver_estado());
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
        if(this.getHoras()>0){
            this.setEstado(true);
            System.out.println("Tiempo de encendido: ");
            int horas =teclado.nextInt();
            this.setHoras(this.getHoras() - horas);
        }
    }

    public void apagar(){
        this.setEstado(false);
    }

    public boolean ver_estado(){
        return this.isEstado();
    }

    public void cambia_potencia(int potencia){
        this.setPotencia(potencia);
    }

    public int ver_potencia() {
        return this.getPotencia();
    }

    public void cambia_color(String color){
        if(this.isEstado()){
            this.apagar();
            this.setColor(color);
        }
    }

    public void ver_color(){
        System.out.println(this.getColor());
    }

    public void recargar(){
        System.out.println("Cuántas horas vas a recargar? ");
        float recargar = teclado.nextFloat();
        this.setHoras(this.getHoras() + recargar);
    }
}
