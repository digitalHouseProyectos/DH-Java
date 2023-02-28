package Clase6;


public class Main {

    public static void main(String[] args) {
        Perros perroMalvado = new Perros(2019, 7, "Thor");
        Perros perroBueno = new Perros("Golden", 2019, 4, true, false, "Zeus");
        System.out.println(perroMalvado);
        System.out.println(perroBueno);
    }
}
