package LEE;

import java.util.Arrays;

public class Sumatoria5 {
    public static void main(String[] args) {
        // Declaración del arreglo con los datos iniciales
        int[] valores = { 2, 4, 6, 8 };

        int[] res1 = new int[4];
        int total1 = 0;
        int suma = 0;
        int total2 = 0;

        // operaciones

        // op1
        res1[0] = valores[0] * valores[0];
        res1[1] = valores[1] * valores[1];
        res1[2] = valores[2] * valores[2];
        res1[3] = valores[3] * valores[3];

        for (int i = 0; i < res1.length; i++) {
            total1 += res1[i];
        }

        // op2
        for (int i = 0; i < valores.length; i++) {
            suma += valores[i];
            total2 = suma * suma;

        }

        // comparación

        if (total1 == total2) {
            System.out.println("No valido");
        } else {
            System.out.println("Valido");
        }

    }
}
