public class Main {
    public static void main(String[] args) {
         //Creacion primer instancia/objeto
        Spartan master_Chief = new Spartan("John Travolta", 100, 70, "Bazooca");

        master_Chief.mostrar_Info();
        master_Chief.atacar("Grunt");
        master_Chief.recargar_Arma(75);
        master_Chief.correr(true);
        //intento cotana:
        //master_Chief

        master_Chief.setNombre("Brian Barron");
        master_Chief.mostrar_Info();
        System.out.println(master_Chief.getNombre());

        //Creacion segunda instancia/objeto
        Spartan jefe_Maistro = new Spartan("Samuel L. Jackson", 100, 100, "glocsita");

        jefe_Maistro.mostrar_Info();
        jefe_Maistro.atacar("Hunter");
        jefe_Maistro.recargar_Arma(100);
        jefe_Maistro.correr(false);
    }
}