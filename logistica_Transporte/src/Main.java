import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        ArrayList<Conductores> conductores = new ArrayList<>();

        String [] opciones = {"Registrar Envio", "Registrar Conductor", "Registrar vehiculo", "4", "5"};
        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(
                    null, "Elige una opcion:", "Logistica Transporte",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]
            );

            switch (opcion) {
                case 0:
                    Envio envio = Envio.crear_Envio();
                    JOptionPane.showMessageDialog(null, "Envio registrado con exito\nCodigo: " + envio.getCodigo_Envio() + "\nDestino: " + envio.getDestino() + "\nPeso:" + envio.getPeso() + "KG");
                    break;
                case 1:
                    Conductores conductor = Conductores.registrar_Conductor();
                    JOptionPane.showMessageDialog(null, "Conducto registrado con exito\nNombre: " + conductor.getNombre() + "\nIdentificaion: " + conductor.getIdentificacion() + "\nLicencia: " + conductor.getIdentificacion());
                    break;
                case 2:
                    Vehiculo vehiculo = Vehiculo.registrarVehiculo();
                    JOptionPane.showMessageDialog(null, "Vehiculo registrado con exito\nPlaca: " + vehiculo.getPlaca() + "\nModelo: " + vehiculo.getModelo() + "\nCapacidad de carga: " + vehiculo.getCapacidad_Carga());
                    break;
                case 3:
                    String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo");
                    Vehiculo vehiculoSeleccionado = null;
                    for (Vehiculo v : vehiculos) {
                        if (v.getPlaca().equalsIgnoreCase(placa)) {
                            vehiculoSeleccionado = v;
                            break;
                        }
                    }

                    if (vehiculoSeleccionado == null) {
                        JOptionPane.showMessageDialog(null, "Vehículo no encontrado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Vehículo encontrado con éxito");
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
            }
        } while (opcion != 4);
        }
    }


    //JOptionPane.showMessageDialog(null, "Hello World");
    //String nombre = JOptionPane.showInputDialog("Dame tu nombre: ");
        //JOptionPane.showMessageDialog(null, "Hola: " + nombre);
    //int op = JOptionPane.showConfirmDialog(null, "Quieres salir?", "confirmar", JOptionPane.YES_NO_CANCEL_OPTION );
        //if (op == JOptionPane.YES_OPTION) {
        //JOptionPane.showMessageDialog(null, "Adios");
    //}else if (op == JOptionPane.NO_OPTION) {
        //JOptionPane.showMessageDialog(null, "No");
