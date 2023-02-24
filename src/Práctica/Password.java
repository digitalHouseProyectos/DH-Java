package Práctica;

public class Password {

    private final static int longitudDef = 8;
    private int longitud;
    private String contrasena;

    public static void main(String[] args) {
        Password pass = new Password(20);
        System.out.println(pass.getContrasena());
        System.out.println(pass.isFuerte());
    }

    public Password(int longitud, String contrasena) {
        this.longitud = longitud;
        this.contrasena = contrasena;
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasena = generarPassword();
    }

    public Password(){
        this.setLongitud(longitudDef);
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasena() {
        return contrasena;
    }

    public boolean isFuerte(){
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        for(int i=0; i<this.getContrasena().length(); i++){
            if(Character.isUpperCase(this.getContrasena().charAt(i))){
                mayusculas++;
            }else if(Character.isLowerCase(this.getContrasena().charAt(i))){
                minusculas++;
            }else numeros++;
        }
        if(mayusculas>=2 && minusculas >=1 && numeros>=5) return true;
        return false;
    }

    public String generarPassword(){
        String password="";
        for (int i=0;i<this.getLongitud();i++){

            int eleccion=((int)Math.floor(Math.random()*3+1));

            if (eleccion==1){
                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
                password+=minusculas;
            }else{
                if(eleccion==2){
                    char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
                    password+=mayusculas;
                }else{
                    char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                    password+=numeros;
                }
            }
        }
        return password;
    }

}
