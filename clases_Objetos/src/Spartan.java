public class Spartan {
    public String nombre;
    public int salud;
    public int escudo;
    public String arma_Principal;

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
}
