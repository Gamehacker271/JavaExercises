package Unidad1.EjerciciosJava2.Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] nums = {67, 38, 3, 4, 2};
        int suma = 0;
        for (int i = 0;i < nums.length; i++) {
            System.out.println("Numero " + i + " es: " + nums[i]);
            suma = suma + nums[i];
        }
        double prom = (double) suma / nums.length;

        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("El promedio de los numeros es: " + prom);
    }

}
