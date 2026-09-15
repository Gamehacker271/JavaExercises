package Unidad2.EjerciciosJava1.Ejercicio7;

import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hola, dime una cantidad de minutos y te dire a cuantas horas y minutos corresponden...");
        int minutosTotales = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los minutos:"));
        int horas = minutosTotales / 60;
        int minutosRestantes = minutosTotales % 60;
        JOptionPane.showMessageDialog(null, "Horas: " + horas + " y" + " Minutos: " + minutosRestantes);
    }

}
