package Aula3;

public class ContaCorrente extends Conta {

	private double saldoInvestimento;
	private String saldoTotal;

	public ContaCorrente(Cliente cliente, int numeroconta, int agência, String senha) {
		super(cliente, numeroconta, agência, senha);

	}

	public void resgatar(double valor) {
		if (this.saldoInvestimento >= valor) {
			this.saldoInvestimento -= valor;
			this.depositar(valor);
		}
	}

	@Override
	public void exibirSaldo() {
		double saldoTotal = this.saldo + this.saldoInvestimento;
		System.out.println("Cliente: " + this.cliente.getNomeTitular());
		System.out.println("Data de abertura: " + this.dataAbertura);
		System.out.println("Saldo conta corrente: R$" + this.saldoTotal);
		System.out.println("Saldo investimentos: R$" + this.saldoInvestimento);
		System.out.println("Saldo Total: R$" + saldoTotal + "\n");
	}

	public void investir(double valor, String tipo) {
		if (tipo == "CDB") {
			float rendimento = (float) (valor * 1.1375);
		} else if (tipo == "LCA") {
			float rendimento = (float) (valor * 1.09);
		} else if (tipo == "CDB") {
			float rendimento = (float) (valor * 1.095);
		}

	}
}