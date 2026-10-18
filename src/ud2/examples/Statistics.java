package ud2.examples;

import java.util.Scanner;
import java.util.Locale;

public class Statistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        int[] nombres = new int[3];

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = in.nextInt();
        }

        int maxim = nombres;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] > maxim) {
                maxim = nombres[i];
            }
        }
        System.out.println("Màxim: " + maxim);

        int minim = nombres;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] < minim) {
                minim = nombres[i];
            }
        }
        System.out.println("Mínim: " + minim);

    }
}