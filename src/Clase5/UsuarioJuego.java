package Clase5;

public class UsuarioJuego {

    private String nombre;
    private String clave;
    private double puntaje;
    private int nivel;

    private static final double puntajeDef = 0;
    private static final int nivelDef = 0;

    public static void main(String[] args) {
        UsuarioJuego usuario = new UsuarioJuego("Adriana", "abc123");
        System.out.println(usuario.toString());
        usuario.aumentarPuntaje();
        usuario.aumentarPuntaje();
        System.out.println(usuario.toString());
        usuario.subirNivel();
        System.out.println(usuario.toString());
        usuario.bonus(10);
        System.out.println(usuario.toString());
    }

    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = puntajeDef;
        this.nivel = nivelDef;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void aumentarPuntaje(){
        this.setPuntaje(this.getPuntaje() + 1);
    }

    public void subirNivel(){
        this.setNivel(this.getNivel() + 1);
    }

    public void bonus(int valor){
        this.setPuntaje(this.getPuntaje() + valor);
    }

    @Override
    public String toString() {
        return
                "Usuario: " + this.getNombre() + "\n" +
                "Puntaje: " + this.getPuntaje() + "\n" +
                "Nivel: " + this.getNivel();
    }
}
