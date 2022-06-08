package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Usuario;

public class UsuarioDAO {

	Connection cnx = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Usuario usuario = null;

	public Usuario consultarUsuario(String usuario, String senha) {
		
		Usuario usu = new Usuario();
		
		
		cnx = DAO.createConnection();
		
		String sql = "SELECT * FROM usuarios WHERE usuário = ? AND senha = ?;";
		
		try {
			ps = cnx.prepareStatement(sql);
			
			ps.setString(1, usuario);
			ps.setString(2, senha);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				usu = new Usuario();
				
				usu.setId(rs.getInt("id"));
				usu.setNome(rs.getString("nome"));
				usu.setUsuario(rs.getString("usuário"));
				usu.setSenha(rs.getString("senha"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return usu;
		
	}

	public List<Usuario> listar() {

		List<Usuario> listaDeUsuarios = new ArrayList<Usuario>();

		cnx = DAO.createConnection();

		String sql = "SELECT * FROM usuarios;";

		try {

			ps = cnx.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {

				usuario = new Usuario();
				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setUsuario(rs.getString("usuário"));
				usuario.setSenha(rs.getString("senha"));

				listaDeUsuarios.add(usuario);
			}

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return listaDeUsuarios;

	}
}
