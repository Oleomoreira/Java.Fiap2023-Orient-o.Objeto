package br.com.fiap.model;

import java.sql.Date;

import br.com.fiap.util.Criptografia;

public class Usuario {
	
	private int id;
	
	private String nome, senha;
	private Date dataCadastro;
	
	public Usuario() {
		
	}
	
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
		try {
		this.senha = Criptografia.criptografar(senha);
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	public Date getDatacadastro() {
		return dataCadastro;
	}

	public void setDatacadastro(Date datacadastro) {
		this.dataCadastro = datacadastro;
	}

	public Usuario( String nome, String senha) {
		this.nome = nome;
		setSenha(senha);
		this.dataCadastro = new Date (System.currentTimeMillis());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
	

}
