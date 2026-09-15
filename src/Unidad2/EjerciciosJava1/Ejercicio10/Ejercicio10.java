package Unidad2.EjerciciosJava1.Ejercicio10;

import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        double cal1, cal2, cal3, eF, tF;
        cal1 = Double.parseDouble(JOptionPane.showInputDialog("Calificacion 1?"));
        cal2 = Double.parseDouble(JOptionPane.showInputDialog("Calificacion 2?"));
        cal3 = Double.parseDouble(JOptionPane.showInputDialog("Calificacion 3?"));
        eF = Double.parseDouble(JOptionPane.showInputDialog("Examen Final??"));
        tF = Double.parseDouble(JOptionPane.showInputDialog("Trabajo Final?"));
        double calM = (cal1 + cal2 + cal3)/3;
        double calF = (calM * 0.55) + (eF * 0.30) + (tF * 0.15);
        JOptionPane.showMessageDialog(null, "Las calificaciones finales del alumno son: " + calF);
    }
}
