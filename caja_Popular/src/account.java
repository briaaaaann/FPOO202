
import javax.swing.JOptionPane;
public class account {
    public int numero_Cuenta;
    public String titular;
    public int edad;
    public double saldo;

    public void consultar_Saldo(){
        String mensaje = "Titular: " + titular + "\nSaldo: $" + saldo;
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public void ingresar_Efectivo(){
        String input = JOptionPane.showInputDialog("Ingresa el monto: ");
        double monto = Double.parseDouble(input);
        saldo += monto;
        String mensaje = "Saldo ingresado con exito.\n";
        mensaje += "Saldo actual:\n" + saldo + "\n";
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public void reitrarEfectivo(){
        String input=JOptionPane.showInputDialog("Ingrese el monto a retirar: ");
        double monto=Double.parseDouble(input);
        saldo-=monto;
        String mensaje= ("El retiro fue exitoso\n ");
        mensaje+="\nEl saldo es:\n " + saldo;
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public void depositarCuenta(){
        String input=JOptionPane.showInputDialog("Ingrese el monto a depositar: ");
        String input2=JOptionPane.showInputDialog("Ingrese el numero de cuenta a depositar: ");
        double monto=Double.parseDouble(input);
        saldo-=monto;
        String mensaje= ("El deposito fue exitoso\n ");
        mensaje+="\nEl saldo es:\n " + saldo;
        JOptionPane.showMessageDialog(null,mensaje);
    }
}


