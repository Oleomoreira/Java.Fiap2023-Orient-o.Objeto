package aula2;

import java.util.Date;

public class Conta {

	// atributos
	private int numeroconta, agência;
	private String senha;
	private Date dataAbertura;
	private double saldo;
	private Cliente cliente;//Composição

	// construtor
	public Conta(Cliente cliente, int numeroconta, int agência, String senha) {
		this.cliente = cliente;
		this.numeroconta = numeroconta;
		this.agência = agência;
		this.dataAbertura = new Date(System.currentTimeMillis());
		System.out.println("Objeto conta criado");
	}

	// sacar
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
						//ou this.saldo - valor;
			return true;
		}
		return false;
	}

	// depositar
	public void depositar(double valor) {
		this.saldo += valor; 
					// ou this.saldo+valor
	}

	// consultarSaldo
	public void exibirSaldo() {
		System.out.println(this.cliente.getNomeTitular() + " - saldo " + this.saldo);
	}

	// transferir
	public void transferir(Conta conta, double valor) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
		conta.depositar(valor);
		}
	}
}
