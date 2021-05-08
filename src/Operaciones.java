import java.util.Scanner;


public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public void Datos () {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero");
		int a = entrada.nextInt();
		System.out.println("Ingresa el segundo numero");
		int b = entrada.nextInt();
		
		System.out.println("La suma es: " + Suma(a, b));
		
			
	}


	public int Suma(int a, int b){
	
	int resultado = a + b;
	return resultado;	
	} 
}
