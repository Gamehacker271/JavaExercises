package EjerciciosJava2.Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] nums = {15, 42, 8, 99, 23, 76, 4, 55};
        int mayor = nums[0];
        for (int i = 0;i < nums.length; i++) {
            System.out.println("Numero " + i + " es: " + nums[i]);
            if (nums[i] > mayor){
                mayor = nums[i];
            }
        }
        System.out.println("El numero mayor del arreglo es: " + mayor);
    }

}
