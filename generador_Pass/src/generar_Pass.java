import javax.swing.*;

public class generar_Pass {
    public int lenght = 8;
    public boolean include_May;
    public boolean caract_Esp;
    public static String NUMEROS = "0123456789";
    public static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    public static String ESPECIALES = "!@#$%&*?_-";
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
}


