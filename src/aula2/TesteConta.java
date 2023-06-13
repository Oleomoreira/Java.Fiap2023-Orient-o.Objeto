package aula2;

public class TesteConta {

	public static void main(String[] args) {
		
		//objetos
		Cliente Leonardo = new Cliente("Leonardo", "123456789", "123456789", "Rua 1");
		Cliente Silvia = new Cliente("Silvia", "987654321", "987654321", "Rua 2");
		Conta contaLeonardo = new Conta(Leonardo, 1,1, "teste" );
		Conta contaSilvia = new Conta(Silvia,  2,1, "teste");

		//simulação
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
		
		
	}

}
