package ud2.exercises;

import java.util.Scanner;
import java.util.Locale;

public class Statistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        int[] nombres = new int[3];

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = in.nextInt();
        }

        int suma = 0;
        for (int i = 0; i < nombres.length; i++) {
            suma += nombres[i];
        }
        System.out.println("Suma: " + suma);
    }
}