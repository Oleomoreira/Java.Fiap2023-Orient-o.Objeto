package ConexãoComBanco;

import java.sql.Date;

public class Usuario {
	
	private String nome, senha;
	private long id;
	private Date datacadastro;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public long getIdUsuario() {
		return id;
	}

	public void setIdUsuario(long idUsuario) {
		this.id = idUsuario;
	}

	public Date getDatacadastro() {
		return datacadastro;
	}

	public void setDatacadastro(Date datacadastro) {
		this.datacadastro = datacadastro;
	}

	public Usuario(long id, String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
		this.id = id;
		this.datacadastro = new Date (System.currentTimeMillis());
	}


	
	

}
