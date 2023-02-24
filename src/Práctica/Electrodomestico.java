package Práctica;

public class Electrodomestico {

    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    private final static String colorDef = "blanco";
    private final static char consumoEnergeticoDef = 'F';
    private final static double precioBaseDef = 100;
    private final static double pesoDef = 5;

    private final static String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
    //private final static char

    public static void main(String[] args) {

    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void comprobarConsumoEnergetico(char letra){

    }
}
