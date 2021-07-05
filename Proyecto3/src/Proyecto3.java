import java.util.Scanner;

public class Proyecto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		int sumaPar=0;
	    int sumaImpar=0;
	
		Scanner leerNumero = new Scanner(System.in);
		
		System.out.println("Introduce tu primer numero:");
		numero = leerNumero.nextInt();
		
		valores(numero, sumaPar, sumaImpar);
		
		

	}
	
	public static void valores(int numero, int sumaPar, int sumaImpar) {
		if (numero%2==0) {
			System.out.println("es par");
			
				sumaPar = (numero / 2) * ( (numero / 2) + 1);
				sumaImpar = ((numero + 1) / 2)*((numero + 1) / 2);
				
				System.out.println("La suma de todos los pares es igual a "
						+ sumaPar);
				System.out.println("La suma de todos los impares es igual a "
						+ sumaImpar);
			
		}else {
			System.out.println("es impar");
			sumaPar = (numero / 2) * ( (numero / 2) + 1);
			sumaImpar = ((numero + 1) / 2)*((numero + 1) / 2);
			
			System.out.println("La suma de todos los pares es igual a "
					+ sumaPar);
			System.out.println("La suma de todos los impares es igual a "
					+ sumaImpar);
		}
		
	}
	
	}


