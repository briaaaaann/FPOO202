public class Spartan {

    private String nombre;
    private int salud;
    private int escudo;
    private String arma_Principal;

    public Spartan(String nombre, int salud, int escudo, String arma_Principal) {
        this.nombre = nombre;
        this.salud = salud;
        this.escudo = escudo;
        this.arma_Principal = arma_Principal;
    }

    public void mostrar_Info(){
        System.out.println("--------- Informacion del Spartan --------");
        System.out.println("Nombre: " + nombre);
        System.out.println("% de Salud: " + salud);
        System.out.println("% de Escudo: " + escudo);
        System.out.println("Arma disponible: " + arma_Principal);
        System.out.println("----------------------------------------");
    }
    public void atacar(String enemigo){
        System.out.println(nombre + " ataca a " + enemigo + " con " + arma_Principal);
    }
    public void recargar_Arma(int municiones){
        int restantes = municiones = 10;
        int total = restantes + municiones;
        System.out.println(arma_Principal + " ahora dispone de: " + total + " balas");
    }
    public void correr(boolean status){
        if(status){
            System.out.println(nombre + " esta corriendo");
        }else{
            System.out.println(nombre + " no esta corriendo");
        }
    }
    private void consultar_Cortana(){
        System.out.println("Conversacion privada");
    }




















    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public String getArma_Principal() {
        return arma_Principal;
    }

    public void setArma_Principal(String arma_Principal) {
        this.arma_Principal = arma_Principal;
    }
}
