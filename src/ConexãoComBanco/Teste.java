package ConexãoComBanco;

public class Teste {
	
	public static void main(String[] args) {
		
		UsuarioDAO dao = new UsuarioDAO();
		Usuario Leonardo = new Usuario (1, "Leonardo", "abcd123");//Istanciando
		
		dao.insert(Leonardo);
		
	}


}

