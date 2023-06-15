package fabricaveiculos;

import java.util.Date;

public abstract class Veiculo {

	protected String tipoPneu, numeroSerie, cor, placa, porte, modelo;
	protected Date dataFabricacao;
	protected double limiteVeiculo, valorVeiculo, velocidadeVeiculo;
	private static long contador;
	protected int status;
	
	public Veiculo(String tipoPneu, String numeroSerie, String cor, String placa, String porte, String modelo,
			Date dataFabricacao, double limiteVeiculo, double valorVeiculo, double velocidadeVeiculo, int satus) {
		super();
		this.tipoPneu = tipoPneu;
		this.numeroSerie = numeroSerie;
		this.cor = cor;
		this.placa = placa;
		this.porte = porte;
		this.modelo = modelo;
		this.dataFabricacao = dataFabricacao;
		this.limiteVeiculo = limiteVeiculo;
		this.valorVeiculo = valorVeiculo;
		this.velocidadeVeiculo = velocidadeVeiculo;
		this.status = status;
		
		contador++;
	}
	
	//metódo para ligar o veiculo
	
	public boolean status(int valor) {
		if (valor == 1) {
			if (this.status = ligado) {
				this.saldo -= valor;
				// ou this.saldo - valor;
				return true;
			}
			return false;
		}
		return false;
	}
	}
	
	
	}

