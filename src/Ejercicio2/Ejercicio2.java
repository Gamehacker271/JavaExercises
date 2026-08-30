package Ejercicio2;
import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        boolean valid = false;
        double precio = 0.0;
        double numero = 0.0;
        final int iva = 21;
        do {
            try {
                String input = JOptionPane.showInputDialog("Ingresa el precio del producto: ");
                numero = Double.parseDouble(input);
                precio = numero + (numero * iva / 100);
                valid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Debes ingresar un número válido.");
            }
        } while (valid == false);

        JOptionPane.showMessageDialog(null,"El precio original del producto fue: " + numero + "\n" + "El IVA aplicado fue del: " + iva + "\n" + "El precio del producto con IVA es: " + precio);
    }
}
// Sayori is the best btw
