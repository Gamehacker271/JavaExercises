package EjerciciosJava2.Ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] nums = {12, 7, 4, 19, 22, 15, 8, 30, 11, 3};
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Posición " + i + ": " + nums[i]);
            if (nums[i] %2 == 0) {
                pares++;
            }else{
                impares++;
            }
        }
        System.out.println("Numeros Pares: " + pares);
        System.out.println("Numeros Impares: " + impares);
    }

}
