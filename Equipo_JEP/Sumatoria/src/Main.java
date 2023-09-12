import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ValoresX = new int[4];
        int[] ValoresY = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese el valor x para el punto " + (i + 1) + ": ");
            ValoresX[i] = scanner.nextInt();
            System.out.print("Ingrese el valor y para el punto " + (i + 1) + ": ");
            ValoresY[i] = scanner.nextInt();
        }

        int sumaX = sumatoriaIndividual(ValoresX);
        int sumaY = sumatoriaIndividual(ValoresY);
        int sumatoriaConjunto = sumaX + sumaY;

        //Mensajes para confirmación del usuario
        System.out.println("Suma de los valores en x:  " + sumaX);
        System.out.println("Suma de los valores en y : " + sumaY);
        System.out.println("La sumatoria individual es: " + (sumaX + sumaY));
        System.out.println("La sumatoria del conjunto es: " + sumarParejas(ValoresX, ValoresY));

        scanner.close();
    }

    public static int sumatoriaIndividual(int[] array) {
        int suma = 0;
        for (int valor : array) {
            suma += valor;
        }
        return suma;
    }

    public static int sumarParejas(int[] ArrayX, int[] ArrayY) {
        int sumatoriaParejas = 0;
        for (int i = 0; i < ArrayX.length; i++) {
            sumatoriaParejas += (ArrayX[i] + ArrayY[i]);
        }
        return sumatoriaParejas;
    }
}
