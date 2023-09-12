package algoritmos;

public class sumatoria_3 {
	public static void main(String [] Args) {
		// Declaración de variables
		int resultado1, suma1, suma2, resultado2;
		// Inicialización de variables
		resultado1 = 0;
		suma1 = 0;
		suma2 = 0;
		resultado2 = 0;
		// Declaración de los arreglos
		int [] array_1 = {2,4,6,8};
		int [] array_2 = {5,4,3,2};
		// Sumatoria de x + y
		for (int i=0; i<=3; i++) {
			resultado1 = resultado1 + (array_1[i] + array_2[i]);
		}
		// Sumatoria de x, y (por separado)
		for (int i=0; i<=3; i++) {
			suma1 = suma1 + array_1[i];
			suma2 = suma2 + array_2[i];
		}
		// Almacenamiento del resultado de la sumatoria de x y y
		resultado2 = suma1 + suma2;

		// Validación de la propiedad de sumatorias
		if (resultado1 == resultado2) {
			System.out.println("Valido");
		}
		else {
			System.out.println("No valido");
		}
	}
}
