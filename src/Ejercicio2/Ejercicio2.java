package Ejercicio2;
import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        boolean valid = false;
        double precio = 0.0;
        do {
            try {
                String input = JOptionPane.showInputDialog("Ingresa el precio del producto: ");
                double numero = Double.parseDouble(input);
                final int iva = 21;
                precio = numero + (numero * iva / 100);
                valid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Debes ingresar un número válido.");
            }
        } while (valid == false);

        JOptionPane.showMessageDialog(null, "El precio del producto con IVA es: " + precio);
    }
}
// Sayori is the best btw
