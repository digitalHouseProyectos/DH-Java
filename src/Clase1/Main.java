package Clase1;

public class Main {
    public static void main(String[] args) {

        Mascota perro = new Mascota();
        perro.setName("Manchitas");
        System.out.println("La mascota se llama " + perro.getName());
    }
}

class Mascota {
    String name;
    Integer edad;
    double comida;
    String gesto;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public double getComida() {
        return comida;
    }

    public void setComida(double comida) {
        this.comida = comida;
    }

    public String getGesto() {
        return gesto;
    }

    public void setGesto(String gesto) {
        this.gesto = gesto;
    }
}