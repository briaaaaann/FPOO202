import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        String apellidoPaterno = JOptionPane.showInputDialog("Ingrese el apellido paterno: ");
        String apellidoMaterno = JOptionPane.showInputDialog("Ingrese el apellido materno: ");
        String fechaNacimiento = JOptionPane.showInputDialog("Ingrese el fecha nacimiento (DD/MM/YYYY): ");
        String carrera = JOptionPane.showInputDialog("Ingrese el carrera: ");
        Matricula matricula = new Matricula(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, carrera);
        matricula.generarMatricula();

    }
}
