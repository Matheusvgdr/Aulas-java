package app;

import java.sql.Connection;
import java.util.List;

import dao.DAO;
import dao.UsuarioDAO;
import modelo.Usuario;

public class App {

	public static void main(String[] args) {
		
//		Connection conex = null;
//		
//		conex = DAO.createConnection();
//		
//		if(conex != null) {
//			System.out.println("Banco conectado com sucesso");
//			
//		}else {
//		
//		System.out.println("Falha na conexão");
//		}
		List<Usuario> lista;
		
		UsuarioDAO dao = new UsuarioDAO();
		
		lista = dao.listar();
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
	
	}

}
