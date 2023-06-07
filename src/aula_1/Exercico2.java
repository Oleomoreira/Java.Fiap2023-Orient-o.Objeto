package aula_1;

import java.util.Scanner;

public class Exercico2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor informe sua idade");
		int idade = sc.nextInt();
		
		if(idade < 16) {
			System.out.println("Você ainda é muito novo, não pode embarcar nem votar ");
		}
		else if (idade >= 16 && idade < 18 ) {
			System.out.println("Sua votação é opcional, pode embarcar se quiser.");
		} 
		if (idade >= 18) {
			System.out.println("Você pode embancar em nossa van ");
		}
	}

}
