package aula_1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//1)O estatuto de uma ong determina que todas as doações recebidas 
		//devem gerar um valor para investimento, para cobrir momentos de necessidade.
		//O valor do investimento deve ser de 5% da doação. porém,
		//em casos em que as doações ultrapassem R$1000,00 o investimento deve ser de 15% 
		//da doação.
		//sua missão é criar um programa capaz de
		//fazer os calculos necessários e indicar quanto deve ser investido

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, agracemos pela sua doação em nossa ONG, por favor coloque abaixo o valor no qual deseja doar");
		float vdoacao = sc.nextFloat();
			
		if (vdoacao < 1000.00) {
			float valorinvestimento = vdoacao * 0.5F;
			System.out.println("o valor investido deve ser:" + valorinvestimento);
		}else if (vdoacao >= 1000.00){
			float valorinvestimento =  vdoacao * 0.15F;
			System.out.println("O valor investido deve ser:" + valorinvestimento);
		}
		
		sc.close();
	}

}
