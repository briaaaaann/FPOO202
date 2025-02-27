
import javax.swing.JOptionPane;
public class account {
    private int numero_Cuenta;
    private String titular;
    private int edad;
    private double saldo;

    public account(int numero_Cuenta, String titular, int edad, double saldo) {
        this.numero_Cuenta = numero_Cuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }

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











    public int getNumero_Cuenta() {
        return numero_Cuenta;
    }

    public void setNumero_Cuenta(int numero_Cuenta) {
        this.numero_Cuenta = numero_Cuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}


