package Unidad2.EjerciciosJava1.Ejercicio6;

import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {
        double media, num1, num2, num3;
        JOptionPane.showMessageDialog(null, "Hola, dime 3 numeros y calculare su promedio:");
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Numero 1?"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Numero 2?"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Numero 3?"));
        media = (num1 + num2 + num3) / 3;
        JOptionPane.showMessageDialog(null, "El promedio de los numeros es: " + media);

    }

}
