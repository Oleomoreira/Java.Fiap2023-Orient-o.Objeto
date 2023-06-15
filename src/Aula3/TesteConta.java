package Aula3;

import java.text.ParseException;

public class TesteConta {

	private static final String ContaLeonardo = null;
	private static final String cdb = null;

	public static void main(String[] args) throws ParseException  {

		// objetos
		Cliente Leonardo = new Cliente("Leonardo", "123456789", "123456789", "Rua 1", "30/05/2005");
		Cliente Silvia = new Cliente("Silvia", "987654321", "987654321", "Rua 2", "01/05/1964");
		ContaCorrente contaLeonardo = new ContaCorrente(Leonardo, 1, 1, "teste");
		ContaCorrente contaSilvia = new ContaCorrente(Silvia, 2, 1, "teste");

		// simulação
		contaLeonardo.depositar(10000);
		contaSilvia.depositar(20000);

		contaLeonardo.exibirSaldo();
		contaSilvia.exibirSaldo();

		contaLeonardo.sacar(1000);
		contaSilvia.sacar(2000);

		contaLeonardo.exibirSaldo();
		contaSilvia.exibirSaldo();

		contaLeonardo.transferir(contaSilvia, 1000);

		contaLeonardo.exibirSaldo();
		contaSilvia.exibirSaldo();

		Conta.exibirContador();
		
		contaLeonardo.investir(cdb, 1000);
		System.out.println(contaLeonardo);
		System.out.println(contaSilvia);

	}

}
