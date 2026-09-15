package Unidad2.EjerciciosJava1.Ejercicio3;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        double catA, catB, hipo, sqA, sqB;
        JOptionPane.showMessageDialog(null, "Hola, dime 2 catetos de un triangulo rectangulo y te dire su hipotenusa: ");
        catA = Double.parseDouble(JOptionPane.showInputDialog("Cateto A?"));
        sqA = Math.pow(catA, 2);
        catB = Double.parseDouble(JOptionPane.showInputDialog("Cateto B?"));
        sqB = Math.pow(catB, 2);
        hipo = Math.sqrt(sqA + sqB);
        JOptionPane.showMessageDialog(null, "La hipotenusa de tu triangulo rectangulo es: " + hipo);
    }
}
