package Clase5;

public class Articulo {
    private String descripcion;
    private double precioVenta;
    private int stock;

    public static void main(String[] args) {
        Articulo articulo = new Articulo("Artículo 1", 1100.00, 10);
        if(articulo.hayStock()){
            System.out.println("Hay stock");
        }
        System.out.println("El precio de venta es: " + articulo.getPrecioVenta());
    }

    public Articulo(String descripcion, double precioVenta, int stock) {
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public boolean hayStock(){
        return stock>0;
    }

    public double consultarPrecio(){
        return precioVenta;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
