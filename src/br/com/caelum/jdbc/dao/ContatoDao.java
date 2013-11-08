/**
 * Classe 
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



package br.com.caelum.jdbc.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Contato;

public class ContatoDao {

	// a conexão com o banco
	private Connection connection;
	
	
	
	public ContatoDao(){
		this.connection = new ConnectionFactory().getConnection();
		
	}

	
	
	public void adiciona(Contato contato){
		String sql ="INSERT INTO CONTATOS"+
				"(nome,email,endereco,dataNascimento)"+
				"values (?,?,?,?)";
		
		try{
			//prepared statement para insercão
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			// set os valores
			
			
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			contato.getDataNascimento();
			contato.getDataNascimento();
			stmt.setDate(4,new java.sql.Date(Calendar.getInstance().getTime().getTime()));
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e ){
			throw new RuntimeException(e);
		}
	}
	
	
	public List<Contato> getLista(){
		try{
			List<Contato> contatos = new ArrayList<Contato>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from Contatos");
			
			ResultSet  query= stmt.executeQuery();
			
			while(query.next()){
				// cria objeto contato
				
				Contato contato = new Contato();
				contato.setId(query.getLong(1));
				contato.setNome(query.getString(2));
				contato.setEmail(query.getString(3));
				contato.setEndereco(query.getString(4));
				
				Calendar data =  Calendar.getInstance();
				data.setTime(query.getDate("dataNascimento"));
				contato.setDataNascimento(data);
				
				contatos.add(contato);
				
			}
			
			query.close();
			stmt.close();
			
			return contatos;
			
		}catch(SQLException e){
			throw new RuntimeException();
		}
		
	}
}
