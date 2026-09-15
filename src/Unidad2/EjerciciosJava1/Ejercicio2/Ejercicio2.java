package Unidad2.EjerciciosJava1.Ejercicio2;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        double perimetro, area, altura, base;
        JOptionPane.showMessageDialog(null, "Hola, vamos a calcular el perimetro y area de un rectangulo, para comenzar, dame los siguentes datos: ");
        altura = Double.parseDouble(JOptionPane.showInputDialog("Dame la altura del rectangulo"));
        base = Double.parseDouble(JOptionPane.showInputDialog("Dame la base del rectangulo"));
        perimetro = 2*(altura + base);
        area = (base * altura);
        JOptionPane.showMessageDialog(null, "El perimetro de tu rectangulo es: " + perimetro + " y su area es: " + area);
    }

}
