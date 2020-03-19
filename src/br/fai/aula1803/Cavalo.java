package br.fai.aula1803;

import java.util.ArrayList;

public class Cavalo extends Animal {
    
	public Cavalo(String nome, int id) {
	  setNome(nome);
	  setId(id);
	}
	
	public void CadastrarCavalo(ArrayList<Cavalo>cavalo) {
		
		System.out.println("O cavlo foi inserido com sucesso!");
	}
	
	public void listarCavalos(ArrayList<Cavalo>cavalo) {
		
		while(cavalo.isEmpty()){
	            System.out.println(cavalo.remove(0));
	        }
		
	}
	
	@Override
    public void quantidadeDeAnimaisCadastrados() {
	    System.out.println("o numero de cavalos cadastrados é:");	
	}
}
