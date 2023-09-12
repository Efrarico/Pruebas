
public class producto {

	public static int producto2(int k, int n) {
		int resultado = k * n;
		return resultado;
	}

	public static int sumar(int k2, int n2) {
		int suma = 0;
		for(int i = 0; i < n2;i++) {
			suma = suma + k2;
		}
		return suma;
	}

public static void main(String[] args) 
{
	int re1 = producto.producto2(9, 4);
	int re2 = producto.sumar(9, 4);
	if (re1 == re2) {
		System.out.println("Valido");
	}
	else {
		System.out.println("No valido");
	}
	System.out.println(re1);
	System.out.println(re2);
	
}

}
