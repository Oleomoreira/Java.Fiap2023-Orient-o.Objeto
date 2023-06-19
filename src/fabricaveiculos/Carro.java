package fabricaveiculos;

import java.util.Date;

public class Carro extends Veiculo {
	
	private int qtdRodas;

	public Carro(String chassi, String placa, String cor, String modelo, Date dataFabricacao, boolean isLigado) {
		super(chassi, placa, cor, modelo, dataFabricacao, isLigado);
		
	}
	//metódo para ligar o veiculo
		public void ligar() {
			if (super.isLigado()) {
				System.out.println("Carro está ligado?");
			}else {super.isLigado = true;
			System.out.println("Carro foi ligado");
		}
		}
				
		//metodo para desligar o veiculo
		
		public void desligar() {
			if (super.isLigado()) {
				super.isLigado = false;
				System.out.println("O carro foi desligado");
			}else {
				System.out.println("O carro já está desligado");
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
