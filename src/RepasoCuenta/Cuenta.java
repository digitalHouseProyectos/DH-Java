package RepasoCuenta;

import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Cuenta {

    private int numeroDeCuenta;
    private double saldo;

    public static void main(String[] args) {
        //Esto es lo que se ejecuta
        Cuenta cuenta1 = new Cuenta(123, 10000);
        Cuenta cuenta2 = new Cuenta(456, 25000);
        Cuenta cuenta3 = new Cuenta(345);

        Scanner teclado = new Scanner(System.in);
        System.out.println(cuenta1.getSaldo());
        cuenta1.depositar(5000);
        System.out.println(cuenta1.getSaldo());
        cuenta1.retirar(8000);
        System.out.println(cuenta1.getSaldo());
    }

    public Cuenta(int numeroDeCuenta, double saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    public Cuenta(int numeroDeCuenta){
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = 0;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double dinero){
        this.setSaldo(this.getSaldo() + dinero);
    }

    public void retirar(double dinero){
        if(this.getSaldo() >= dinero){
            this.setSaldo(this.getSaldo() - dinero);
        }
    }
}
