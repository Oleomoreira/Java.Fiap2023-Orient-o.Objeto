package fabricaveiculos;

import java.util.Date;

public class Moto extends Veiculo {
	
	private int qtdRodas;
	
	public Moto(String chassi, String placa, String cor, String modelo, Date dataFabricacao, boolean isLigado) {
		super(chassi, placa, cor, modelo, dataFabricacao, isLigado);
		this.qtdRodas = 2;
	}
	
	//metódo para ligar o veiculo
	public void ligar() {
		if (super.isLigado()) {
			System.out.println("Moto está ligada?");
		}else {super.isLigado = true;
		System.out.println("Moto foi ligada");
	}
	}
			
	//metodo para desligar o veiculo
	
	public void desligar() {
		if (super.isLigado()) {
			super.isLigado = false;
			System.out.println("A moto foi desligada");
		}else {
			System.out.println("A moto já está desligada");
		}
	}
	
	//Metódo get e set para os valores do atributo qtdRodas
	public Integer getQtdRodas() {
		return qtdRodas;
	}

	public void setQtdRodas(Integer qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

}
	
	


