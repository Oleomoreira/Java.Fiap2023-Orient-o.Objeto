package aula_1;

public class Fatorial {

	public static void main(String[] args) {
		
		int fatorial = 1, valor = 10;
		
		for (int i = 1; i <= valor; i++) {
			fatorial = fatorial * i;
		}
		
		System.out.println(valor + "!  = " + fatorial);
	}

}
