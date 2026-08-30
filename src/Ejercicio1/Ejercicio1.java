package Ejercicio1;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        boolean valid = false;
        int numero = 0;
        do {
            try{
                String input = JOptionPane.showInputDialog("Ingrese un número cualquiera: ");
                numero = Integer.parseInt(input);
                if (numero % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "El número es divisible entre 2");
                } else {
                    JOptionPane.showMessageDialog(null, "El número no es divisible entre 2");
                }
                valid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Debes ingresar un número válido.");
            
            }
        } while (valid == false);
    }
}

// Sayori is the best btw
