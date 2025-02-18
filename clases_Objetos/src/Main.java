public class Main {
    public static void main(String[] args) {
         //Creacion primer instancia/objeto
        Spartan master_Chief = new Spartan();

        //Usar atributos
        master_Chief.nombre = "John Travolta";
        master_Chief.salud = 100;
        master_Chief.escudo = 70;
        master_Chief.arma_Principal = "Bazooca";

        master_Chief.mostrar_Info();
        master_Chief.atacar("Grunt");
        master_Chief.recargar_Arma(75);
        master_Chief.correr(true);

        //Creacion segunda instancia/objeto
        Spartan jefe_Maistro = new Spartan();

        jefe_Maistro.nombre = "Samuel L. Jackson";
        jefe_Maistro.salud = 100;
        jefe_Maistro.escudo = 100;
        jefe_Maistro.arma_Principal = "glocsita";

        jefe_Maistro.mostrar_Info();
        jefe_Maistro.atacar("Hunter");
        jefe_Maistro.recargar_Arma(100);
        jefe_Maistro.correr(false);
    }
}