package AulaMapas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teste {

	public static void main(String[] args) {

		
		//ObjetostipoUsuarios
		Usuario emerson = new Usuario(1,"Emerson", "abc");
		Usuario adriane = new Usuario(2,"Adriane", "abc");
		Usuario maria = new Usuario(3,"Maria", "abc");
		Usuario joao = new Usuario(4,"Joao", "abc");
		Usuario pedro = new Usuario(5,"Pedro", "abc");
		
		
		//Collection(lista de usuários
		
		List<Usuario> listaUsuarios = new ArrayList<Usuario> ();
		
		//Adicionando objetos Usuario a lista de usuario
		
		listaUsuarios.add(pedro);
		listaUsuarios.add(joao);
		listaUsuarios.add(maria);
		listaUsuarios.add(adriane);
		listaUsuarios.add(emerson);
		
		//iterando a lista
		for(Usuario usuario : listaUsuarios) {
			System.out.println("id: " +usuario.getIdUsuario() + " -- " + "Nome" + usuario.getNome());
			
		}
		
		//Ordenar a lista conforme a regra definida no compareTo
		Collections.sort(listaUsuarios);
		
		//iterando a lista ordenada conforme
		for(Usuario usuario : listaUsuarios) {
			System.out.println("id: " +usuario.getIdUsuario() + " -- " + "Nome" + usuario.getNome() );
			
		}
		
	
		
		
		
	}

}
