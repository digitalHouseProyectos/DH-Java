package Clase3;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void cualGana(){
        String j1 = "";
        String j2 = "";
        List<Integer> cuentaJ1 = new ArrayList<Integer>();
        List<Integer> cuentaJ2 = new ArrayList<Integer>();

        do{

            System.out.println("Juego piedra-papel-tijera");
            Scanner teclado = new Scanner(System.in);

            System.out.print("Indique su seleccion [1=Piedra, 2=Papel, 3=Tijera]: ");
            j1 = teclado.nextLine();

            System.out.print("Indique su seleccion [1=Piedra, 2=Papel, 3=Tijera]: ");
            j2 = teclado.nextLine();

            switch (j1){
                case "1":
                    System.out.println("Piedra");
                    switch (j2){
                        case "1":
                            System.out.println("Empate");
                            break;
                        case "2":
                            System.out.println("J2 Gana");
                            cuentaJ2.add(1);
                            break;
                        case "3":
                            System.out.println("J1 Gana");
                            cuentaJ1.add(1);
                            break;
                    } break;
                case "2":
                    System.out.println("Papel");
                    switch (j2){
                        case "1":
                            System.out.println("J1 Gana");
                            cuentaJ1.add(1);
                            break;
                        case "2":
                            System.out.println("Empate");
                            break;
                        case "3":
                            System.out.println("J2 Gana");
                            cuentaJ2.add(1);
                            break;
                    } break;
                case "3":
                    System.out.println("Tigeras");
                    switch (j2){
                        case "1":
                            System.out.println("J2 Gana");
                            cuentaJ2.add(1);
                            break;
                        case "2":
                            System.out.println("J1 Gana");
                            cuentaJ1.add(1);
                            break;
                        case "3":
                            System.out.println("Empate");
                            break;
                    }break;
            }
        }while(!j1.equals("*") && !j2.equals("*"));

        Integer jugador1 = cuentaJ1.stream().mapToInt(Integer::intValue).sum();
        Integer jugador2 = cuentaJ2.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Jugador 1: " + jugador1 + " " + "Jugador 2: " + jugador2);
    }

    public static void primos(int max){
        int numero = 0;
        int cantidad = 0;
        while(cantidad <= max){
            if(esPrimo(numero)){
                System.out.println(numero);
                cantidad ++;
            }
            numero ++;
        }
    };
    public static boolean esPrimo(int num){
        if(num == 0 || num == 1 || num ==4) return false;
        for(int x = 2; x < num / 2; x++){
            if(num % x == 0) return false;
        }
        return true;
    };

    public static void salario(int horas){
        double valorHora = 875;
        double salario = 0;
        int extras = 0;
        if(horas >40){
            extras = horas - 40;
            salario = 40*valorHora + extras*valorHora + extras*valorHora/2;
        }else salario = horas*valorHora;
        System.out.println("El salario de Julieta es: " + salario);
    }

    public static void main(String[] args) {
        //cualGana();
        //primos(10);
        salario(45);
    }
}
