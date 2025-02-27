import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String longitud = JOptionPane.showInputDialog("Ingresa la Longitud de la contraseña:");
        int lenght = Integer.parseInt(longitud);

        if (longitud == null || longitud.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Longitud no válida.");
            return;
        }
        if (longitud.matches("\\d+")) {
            lenght = Integer.parseInt(longitud);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido.");
            return;
        }

        JCheckBox checkBox = new JCheckBox("Agregar mayúsculas");
        JCheckBox checkBoxEsp = new JCheckBox("Caracteres especiales");

        Object[] message = {"Seleccione opciones:", checkBox, checkBoxEsp};
        int option = JOptionPane.showConfirmDialog(null, message, "Confirmación", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION) {
            //int option = JOptionPane.showConfirmDialog(null, message, "Confirmación", JOptionPane.OK_CANCEL_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada.");
            return;
        }
        boolean checked = checkBox.isSelected();
        boolean checkedEsp = checkBoxEsp.isSelected();

        generar_Pass pass = new generar_Pass(lenght, checked, checkedEsp);

        pass.mostrarPassword();
    }
}


