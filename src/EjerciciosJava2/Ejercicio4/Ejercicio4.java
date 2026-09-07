package EjerciciosJava2.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {5, 12, 8, 30, 7, 45, 19, 22, 9, 14};
        System.out.print("Ingresa el número que deseas buscar: ");
        int ns = sc.nextInt();
        boolean f = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ns) {
                f = true;
                break;
            }
        }
        if (f) {
            System.out.println("El numero " + ns + " fue encontrado en el arreglo");
        }else{
            System.out.println("El numero " + ns + " no fue encontrado en el arreglo");
        }
        sc.close();
    }
}
