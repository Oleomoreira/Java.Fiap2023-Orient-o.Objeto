package br.com.fiap.test;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.model.Usuario;
import br.com.fiap.repostory.UsuarioDAO;

public class Teste {

	public static void main(String[] args) throws SQLException {
		
		UsuarioDAO dao = new UsuarioDAO();
		Usuario Leonardo = new Usuario("Leonardo", "abcd123");// Istanciando

		dao.insert(Leonardo);

		List<Usuario> lista = dao.selectALL();

		for(Usuario usuario: lista) {
		System.out.println(usuario.getNome());
		
		}
		
		dao.delete(1);

		for(Usuario usuario: lista) {
			System.out.println(usuario.getId());
			System.out.println(usuario.getNome());
			System.out.println("Data de cadastro:" + usuario.getDatacadastro());
			
		}
		
		

	}
	}
