import javax.swing.*;

public class generar_Pass {
    private int lenght = 8;
    private boolean include_May;
    private boolean caract_Esp;
    private static String NUMEROS = "0123456789";
    private static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static String ESPECIALES = "!@#$%&*?_-";

    public generar_Pass(int lenght, boolean include_May, boolean caract_Esp) {
        this.lenght = lenght;
        this.include_May = include_May;
        this.caract_Esp = caract_Esp;
    }

    public String getPassword() {
        String caracteres = NUMEROS + MINUSCULAS;
        if (include_May) caracteres += MAYUSCULAS;
        if (caract_Esp) caracteres += ESPECIALES;
        String pswd = "";
        for (int i = 0; i < lenght; i++) {
            pswd += caracteres.charAt((int) (Math.random() * caracteres.length()));
        }

        return pswd;
    }
    public void mostrarPassword() {
        String mensaje = "Contraseña generada con éxito\n\nLa contraseña es:\n" + getPassword();
        JOptionPane.showMessageDialog(null, mensaje);
    }











    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public boolean isInclude_May() {
        return include_May;
    }

    public void setInclude_May(boolean include_May) {
        this.include_May = include_May;
    }

    public boolean isCaract_Esp() {
        return caract_Esp;
    }

    public void setCaract_Esp(boolean caract_Esp) {
        this.caract_Esp = caract_Esp;
    }

    public static String getNUMEROS() {
        return NUMEROS;
    }

    public static void setNUMEROS(String NUMEROS) {
        generar_Pass.NUMEROS = NUMEROS;
    }

    public static String getMAYUSCULAS() {
        return MAYUSCULAS;
    }

    public static void setMAYUSCULAS(String MAYUSCULAS) {
        generar_Pass.MAYUSCULAS = MAYUSCULAS;
    }

    public static String getMINUSCULAS() {
        return MINUSCULAS;
    }

    public static void setMINUSCULAS(String MINUSCULAS) {
        generar_Pass.MINUSCULAS = MINUSCULAS;
    }

    public static String getESPECIALES() {
        return ESPECIALES;
    }

    public static void setESPECIALES(String ESPECIALES) {
        generar_Pass.ESPECIALES = ESPECIALES;
    }
}


