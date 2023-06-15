package Aula3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//javabeens: quando a classe só contem atributos e metodos contrutores 
public class Cliente {

	private String nomeTitular, cpfTitular, rgTitular, enderecoTitular;
	private final Date dataNasc;

	
	//construtor
	public Cliente(String nomeTitular, String cpfTitular, String rgTitular, 
			String enderecoTitular, String dataNasc) throws ParseException  {
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
		this.rgTitular = rgTitular;
		this.enderecoTitular = enderecoTitular;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		this.dataNasc = formato.parse(dataNasc);
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public String getRgTitular() {
		return rgTitular;
	}

	public void setRgTitular(String rgTitular) {
		this.rgTitular = rgTitular;
	}

	public String getEnderecoTitular() {
		return enderecoTitular;
	}

	public void setEnderecoTitular(String enderecoTitular) {
		this.enderecoTitular = enderecoTitular;
	}

}
