package AulaMapas;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListVersusLinkedListPerformace {
	
	public static void main(String[] args) {
	
		
		Collection <Long> lista = new ArrayList <Long>();
		
		long inicio = System.currentTimeMillis();
		
		for (long i = 0; i <= 100000000; i++) {
			lista.add(i);
		}
		long fim = 	System.currentTimeMillis();
		
		long tempoGasto = fim - inicio;
		
		System.out.println(tempoGasto);
		
	}

}
