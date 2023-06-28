package br.com.fiap.repostory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.model.Usuario;

public class UsuarioDAO {
	
	private Connection conexao;

	public UsuarioDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}

	
		//insert
		public void insert (Usuario usuario) {
		
			String sql = "insert into usuario ( nome, senha, dataCadastro) values (?,?,?)";
			try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			//insercão de dados
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getSenha());
			stmt.setDate(3, usuario.getDatacadastro());
			
			stmt.execute();
			stmt.close();
			
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//selectAll
		
		public List<Usuario> selectALL(){ // uma list para armazenar odos os registros do select
			
			List<Usuario> usuarios = new ArrayList<Usuario>(); // lista que recebe os dados deste select 
			
			String sql = "select * from usuario order by nome"; // variavel com o comando do sql
			
			try {
				PreparedStatement stmt = conexao.prepareStatement(sql); // prepara o statement do comando 
				ResultSet rs = stmt.executeQuery();	// o resultado deste execute vou salvar nesta variavel, aqui vai ficar o retorno do banco. O ResultSet devolve uma tabela de dados
				
				// while é necessario pois posso ter mais de usuario para retornar
				while(rs.next()) {                                // enquanto tiver dados na tabela, faça:
					Usuario usuario = new Usuario();              // temos um construtor vazio para ir inserindo os outros dados que estao abaixo
					// com os dados da tabela estou construindi o objeto usuario
					
					usuario.setId(rs.getInt("id")); //            esse dado vai ir para o obj usuario que acabei de criar
					usuario.setNome(rs.getString("nome")); //     esse dado vai ir para o obj usuario que acabei de criar
					usuario.setSenha(rs.getString("senha"));//    esse dado vai ir para o obj usuario que acabei de criar
					usuario.setDatacadastro(rs.getDate("dataCadastro")); // esse dado vai ir para o obj usuario que acabei de criar
					
					usuarios.add(usuario); // cada objeto usuario vai ser adicionado a lista usuarios
				}
				rs.close(); // fecho o result
				stmt.close(); // fecho o statement
				
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
			return usuarios;
		}
		//selectByid
			
		public Usuario selectById (int id) {
		Usuario usuario = null; // lista que recebe os dados deste select 
			
			String sql = "select * from usuario where id = ?";
			
			try {
				PreparedStatement stmt = conexao.prepareStatement(sql); // prepara o statement do comando 
				stmt.setInt(1, id);
				ResultSet rs = stmt.executeQuery();	// o resultado deste execute vou salvar nesta variavel, aqui vai ficar o retorno do banco. O ResultSet devolve uma tabela de dados
				
				// while é necessario pois posso ter mais de usuario para retornar
				while(rs.next()) {                                // enquanto tiver dados na tabela, faça:
					usuario = new Usuario();              // temos um construtor vazio para ir inserindo os outros dados que estao abaixo
					// com os dados da tabela estou construindi o objeto usuario
					
					usuario.setId(rs.getInt("id")); //            esse dado vai ir para o obj usuario que acabei de criar
					usuario.setNome(rs.getString("nome")); //     esse dado vai ir para o obj usuario que acabei de criar
					usuario.setSenha(rs.getString("senha"));//    esse dado vai ir para o obj usuario que acabei de criar
					usuario.setDatacadastro(rs.getDate("dataCadastro")); // esse dado vai ir para o obj usuario que acabei de criar
				}
				
				rs.close(); // fecho o result
				stmt.close(); // fecho o statement
				
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
			return usuario;
		}
		//update
		
		public void update (Usuario usuario) {
			String sql = "update usuario set nome=?, senha=? where id=?";
			try {
				PreparedStatement stmt = conexao .prepareStatement(sql);
				stmt.setString(1, usuario.getNome());
				stmt.setString(1, usuario.getSenha());
				stmt.setInt(1, usuario.getId());
				stmt.execute();
				stmt.close();
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//delete
		public void delete (int id) throws SQLException {
			String sql = "delete from usuario where id=?";
			try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, id);
			stmt.execute();		
			stmt.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		}
		
}
	
	


