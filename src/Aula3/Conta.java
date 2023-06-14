package Aula3;

import java.util.Date;

public abstract class Conta { // abstracts proibe a instância da classe - proibe a criação de novos objetos

	// atributos
	protected int numeroconta, agência;
	protected String senha;
	protected Date dataAbertura;
	protected double saldo;
	protected Cliente cliente;// Composição
	private static long contador;

	// construtor
	public Conta(Cliente cliente, int numeroconta, int agência, String senha) {
		this.cliente = cliente;
		this.numeroconta = numeroconta;
		this.agência = agência;
		this.dataAbertura = new Date(System.currentTimeMillis());
		contador++;
		System.out.println("Objeto conta criado");
	}

	// sacar
	public boolean sacar(double valor) {
		if (valor > 0) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				// ou this.saldo - valor;
				return true;
			}
			return false;
		}
		return false;
	}

	// depositar
	public void depositar(double valor) {
		this.saldo += valor;
		// ou this.saldo+valor
	}

	// transferir
	public void transferir(Conta conta, double valor) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			conta.depositar(valor);
		}
	}

	public abstract void exibirSaldo();
	// abstract no metódo força a reescrita

	public static void exibirContador() {
		System.out.println("Contas:" + contador);
	}
}
