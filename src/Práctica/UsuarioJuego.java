package Práctica;

public class UsuarioJuego {

    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;

    public static void main(String[] args) {
        UsuarioJuego usuario1 = new UsuarioJuego("Ramiro", "abc123");
        UsuarioJuego usuario2 = new UsuarioJuego("Flor", "abcd123");
        System.out.println(usuario1);
        System.out.println(usuario2);
        usuario1.aumentarPuntaje();
        usuario1.aumentarPuntaje();
        usuario1.aumentarPuntaje();
        usuario1.aumentarPuntaje();
        System.out.println(usuario1);
        usuario1.subirNivel();
        System.out.println(usuario1);
        usuario1.bonus(5);
        System.out.println(usuario1);
    }

    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0.0;
        this.nivel =0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
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
        return "Usuario: " + this.getNombre() + "\n" +
                "Puntaje: " + this.getPuntaje() + "\n" +
                "Nivel: " + this.getNivel();
    }
}
