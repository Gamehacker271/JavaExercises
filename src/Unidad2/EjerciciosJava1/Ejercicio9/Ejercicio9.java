package Unidad2.EjerciciosJava1.Ejercicio9;

import javax.swing.JOptionPane;

public class Ejercicio9 {
    public static void main(String[] args) {
        double totalC;
        totalC = Double.parseDouble(JOptionPane.showInputDialog("Hola, cuanto es el total de compra? "));
        double descuento = totalC * 0.15;
        double totalP = totalC - descuento;
        JOptionPane.showMessageDialog(null, "Su precio con descuento es de: " + totalP);
    }

}
