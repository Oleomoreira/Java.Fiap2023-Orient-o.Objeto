package fabricaveiculos;

import java.util.Date;

public abstract class Veiculo {
	
	public static Long qtdfabricada = 0L;
	
	private String chassi;
	private String placa;
	private String cor;
	private String modelo;
	private Date dataFabricacao;
	protected boolean isLigado;
	public Veiculo(String chassi, String placa, String cor, String modelo, Date dataFabricacao, boolean isLigado) {
		super();
		this.chassi = chassi;
		this.placa = placa;
		this.cor = cor;
		this.modelo = modelo;
		this.dataFabricacao = dataFabricacao;
		this.isLigado = isLigado;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	public boolean isLigado() {
		return isLigado;
	}
	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	} 
	
	
	
	
	
	
}