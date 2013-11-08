package br.com.caelum.jdbc.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteJdbc {
	
	
	public static void main(String[] args){
		
		
		ContatoDao contato = new ContatoDao();
		
		List<Contato> contatos  = contato.getLista();
		
		for(Contato con:contatos){
			
			System.out.println("Nome: "+con.getNome());
			System.out.println("Email :"+ con.getEmail());
			System.out.println("Endereco: "+con.getEndereco());
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			System.out.println("Data de Nascimento: "+sdf.format(con.getDataNascimento().getTime())+"\n");
			
			
		}
		
	}
		
	
	
}
