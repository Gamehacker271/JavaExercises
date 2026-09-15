package Unidad2.EjerciciosJava1.Ejercicio8;

import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static void main(String[] args) {
        double sueldoB, v1, v2, v3;
        v1 = Double.parseDouble(JOptionPane.showInputDialog("Venta 1?"));
        v2 = Double.parseDouble(JOptionPane.showInputDialog("Venta 2?"));
        v3 = Double.parseDouble(JOptionPane.showInputDialog("Venta 3?"));
        sueldoB = Double.parseDouble(JOptionPane.showInputDialog("Sueldo Base?"));
        double com = (v1 + v2 + v3)*0.10;
        double sueldoT = sueldoB + com;
        JOptionPane.showMessageDialog(null, "Comisiones ganadas: " + com + " Total: " + sueldoT);
    }

}
