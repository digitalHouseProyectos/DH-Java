package Práctica;

public class Cuenta {
    private String titular;
    private double cantidad;

    public static void main(String[] args) {
        Cuenta cuenta =  new Cuenta("Adriana", 10000);
        System.out.println(cuenta.toString());
        cuenta.ingresar(-10000);
        System.out.println("Cantidad negativa" + cuenta.getCantidad());
        cuenta.ingresar(5000);
        System.out.println("Ingreso" + cuenta.getCantidad());
        cuenta.retirar(30000);
        System.out.println("Retirar más" + cuenta.getCantidad());
        cuenta.retirar(3000);
        System.out.println(cuenta.getCantidad());
        System.out.println(cuenta.toString());
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad){
        if(cantidad > 0){
            this.setCantidad(this.getCantidad() + cantidad);
        }
    }

    public void retirar(double cantidad){
        if(this.getCantidad() >= cantidad){
            this.setCantidad(this.getCantidad() - cantidad);
        }
    }

    @Override
    public String toString() {
        return "El titular: " + this.getTitular() + " tiene " + this.getCantidad();
    }
}
