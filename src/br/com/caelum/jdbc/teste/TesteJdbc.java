package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.*;

import java.sql.*;

public class TesteJdbc {
	
	
	public static void main(String[] args){
		
		
		try {
			System.out.println("Iniciando conexao....");
			
			Connection  conexao=new  ConnectionFactory().getConnection();
			
			System.out.println("Conexao Inciada : "+ conexao.toString());
			
			conexao.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
		
		
	
	
	
}
