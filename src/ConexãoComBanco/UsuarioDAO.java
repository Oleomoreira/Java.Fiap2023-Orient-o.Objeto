package ConexãoComBanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UsuarioDAO {
	
	private Connection conexao;

	public UsuarioDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}

	
		//insert
		public void insert (Usuario usuario) {
		
			String sql = "insert into usuarios (id, nome, email, telefone, data) values (?,?,?,?,?)";
			try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, usuario.getIdUsuario());
			
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//selectAll
		
		public List<Usuario> selectAll(){
			return null;
		}
		//selectByid
		
		public Usuario selectByidUsuario(long idUsuario) {
			return null;
		}
		//update
		
		public void update (Usuario usuario) {
		}
		//delete
		public void delete (Usuario usuario) {
		}
		}
	
	


