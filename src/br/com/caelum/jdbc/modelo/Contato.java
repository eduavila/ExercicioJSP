/**
 * Class de modelo JBE
 *
 *
 *
 *
 *@author Eduardo Avila Malheiros
 *
 *
 *@version 1.0v
 *
 *
 */


package br.com.caelum.jdbc.modelo;


import java.util.*;



public class Contato {
	
	
	private Long id;
	private String nome;
	private String email;
	private String endereco;
	private Calendar dataNascimento;
	
	// get e set da propriedades 
	
	public Long getId(){
		return this.id;
	}
	
	public void setId(Long novo){
		this.id = novo;
	}

	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String novo){
		this.nome = novo;
	}
	
	
	public String getEmail(){
		return this.email;
	}
	
	public void setEmail(String novo){
		this.email = novo;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
}
