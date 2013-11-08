/**
 * Classe de conexão com banco de dados.
 * 
 * 
 * 
 * @author Eduardo Avila Malheiros
 * 
 * 
 * @version 1.0v
 * 
 * 
 */


package br.com.caelum.jdbc;


import java.sql.*;


public class ConnectionFactory {

	
	/**
	 * Metodo que pega a conexao com banco dom stringsql;
	 * 
	 * 
	 * @return Connection
	 */
	public Connection getConnection(){
		try{
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21","root","99463782");
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
}
