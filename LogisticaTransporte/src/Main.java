import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            String opcion = JOptionPane.showInputDialog(null, "1. Agregar Empleado\n2. Listar Empleados\n3. Salir", "Menú", JOptionPane.QUESTION_MESSAGE);
            if (opcion == null || opcion.equals("3")) break;
            switch (opcion) {
                case "1":
                    agregarEmpleado();
                    break;
                case "2":
                    listarEmpleados();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }

    private static void agregarEmpleado() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID:"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario:"));
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de empleado (Conductor/Administrativo):");

        if (tipo.equalsIgnoreCase("Conductor")) {
            String licencia = JOptionPane.showInputDialog("Ingrese el tipo de licencia:");
            empleados.add(new Conductor(nombre, id, salario, licencia));
        } else if (tipo.equalsIgnoreCase("Administrativo")) {
            String departamento = JOptionPane.showInputDialog("Ingrese el departamento:");
            empleados.add(new Administrativo(nombre, id, salario, departamento));
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de empleado no válido.");
        }
    }

    private static void listarEmpleados() {
        if (empleados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
        } else {
            for (Empleado e : empleados) {
                e.mostrarInfo();
            }
        }
    }
}
