package Clase2;

public class Main {
    public static String primo(int numero){
        if (numero == 0 || numero == 1 || numero == 4) return "No es primo";
        for (int x = 2; x < numero / 2; x++) {
            if(divisible(numero, x)) return "No es primo";
        };
        return "Es primo";
    };
    public static boolean divisible(int num, int divisor){
        if(num%divisor == 0) return true;
        return false;
    };
    public static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC){
        Integer mayor;
        if(unNumeroA > unNumeroB && unNumeroA > unNumeroC){
            mayor = unNumeroA;
        }else if(unNumeroB > unNumeroA && unNumeroB > unNumeroC){
            mayor = unNumeroB;
        }else mayor = unNumeroC;
        return mayor;
    };
    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
        if(unTextoA.equals(unTextoB)){
            return false;
        }else return true;
    };
    public static void main(String[] args) {
        System.out.println(primo(49));
        System.out.println(divisible(10, 3));
        System.out.println(maximoEntreTresNumeros(40, 10, 2));
        System.out.println(cadenasDeTextoDistintas("adri", "adr"));
    }
}
