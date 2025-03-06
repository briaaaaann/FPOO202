public class Main {
    public static void main(String[] args) {
        SpartanII jefemaestro = new SpartanII("John", 90, "Rifle de asalto", 0);
        jefemaestro.mostrarInfo();
        jefemaestro.usarManejoAvanzado();
        jefemaestro.atacar("Covenant");
        jefemaestro.recibirDano(50);
        jefemaestro.recargarEscudo();

        SpartanIII masterchief = new SpartanIII("Santiago", 3, "Cucharatenedor", 0);
        masterchief.mostrarInfo();
        masterchief.atacar("Covenant");
        masterchief.recibirDano(20);
        masterchief.recargarEscudo();
        masterchief.camuflajeActivo();

        SpartanIV eljefazo = new SpartanIV("Rogelio el Duro", 100, "Nada, no lo necesita", 0);
        eljefazo.mostrarInfo();
        eljefazo.atacar("Covenant");
        eljefazo.recibirDano(20);
        eljefazo.recargarEscudo();
        eljefazo.usarPropulsores();
    }
}


