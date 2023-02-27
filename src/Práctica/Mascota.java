package Práctica;

public class Mascota {

    private String Nombre;
    private Dueño dueño;

    public static void main(String[] args) {
        Dueño dueño1 = new Dueño("Adriana");
        Dueño dueño2 = new Dueño("Raul");
        Mascota perro = new Mascota("Goofy", dueño1);
        Mascota gato = new Mascota("Emma", dueño2);
        System.out.println(perro);
        System.out.println(gato);

    }

    public Mascota(String nombre, Dueño dueño) {
        Nombre = nombre;
        this.dueño = dueño;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Mascota: " + this.getNombre() + "\n" +
                "Dueño: " + this.getDueño().getNombre();
    }
}

class Dueño {
    private String nombre;

    public Dueño(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
