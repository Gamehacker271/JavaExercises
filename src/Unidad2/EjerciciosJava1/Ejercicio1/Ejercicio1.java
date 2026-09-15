package Unidad2.EjerciciosJava1.Ejercicio1;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Hola, dime cual es tu nombre: ");
        JOptionPane.showMessageDialog(null, "Hola " + nombre + ", Bienvenid@...");
    }
}
