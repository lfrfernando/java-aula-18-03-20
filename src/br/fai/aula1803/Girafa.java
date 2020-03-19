package br.fai.aula1803;

import java.util.ArrayList;
import java.util.Scanner;

public class Girafa extends Animal {
	
	Scanner ler = new Scanner(System.in);
	
	public Girafa(String nome, int id) {
	  setNome(nome);
	  setId(id);
	}
	
	
	
	public void CadastrarGirafa() {
		System.out.println("A girafa foi inserida com sucesso!");
	}
    
	public void listarGiarafas(ArrayList<Girafa>girafa) {
		
		while(girafa.isEmpty()){
            System.out.println(girafa.remove(0));
        }
		
	}
	
	
    @Override
    public void quantidadeDeAnimaisCadastrados() {
	    System.out.println("o numero de girafas cadastradas é:");	
	}
}
