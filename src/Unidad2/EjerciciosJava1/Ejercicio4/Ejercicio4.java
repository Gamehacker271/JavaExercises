package Unidad2.EjerciciosJava1.Ejercicio4;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        double num1, num2, suma, resta, division, multiplicacion;
        JOptionPane.showMessageDialog(null, "Hola, dame dos numeros y te dire 4 operaciones de ellos (Suma, resta, multiplicacion y division: ");
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Numero 1?"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Numero 2?"));
        suma = (num1 + num2);
        resta = (num1 - num2);
        multiplicacion = (num1 * num2);
        division = (num1 / num2);
        JOptionPane.showMessageDialog(null, "Los resultados fueron: \n\nSuma: " + suma + "\nResta: " + resta + "\nMultiplicacion: " + multiplicacion + "\nDivision: "+ division);
    }

}
