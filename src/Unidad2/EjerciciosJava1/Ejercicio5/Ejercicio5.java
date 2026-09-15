package Unidad2.EjerciciosJava1.Ejercicio5;

import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {
        double f, cel;
        JOptionPane.showMessageDialog(null, "Hola, dime un numero de grados fahrenheit y la convertire a celsius:");
        f = Double.parseDouble(JOptionPane.showInputDialog("Valor fahrenheit?"));
        cel = (f - 32) * 5.0 / 9.0;
        JOptionPane.showMessageDialog(null,"Los grados en celsius son: " + cel);
    }
}
