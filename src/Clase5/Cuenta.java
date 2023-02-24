package Clase5;

public class Cuenta {
    private int numeroDeCuenta;
    private double saldo;

    public static void main(String[] args) {
        Cuenta ahorros = new Cuenta(101, 10000);
        ahorros.depositar(2500);
        ahorros.retirar(3500);
        System.out.println(ahorros.getSaldo());
    }

    public Cuenta(int numeroDeCuenta, double saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
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
