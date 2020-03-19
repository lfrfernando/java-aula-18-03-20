package br.fai.aula1803;

import java.util.Scanner;

public class Girafa extends Animal {
	
	Scanner ler = new Scanner(System.in);
	
	public void cadastrarGirafas(int id, String nome) {
		System.out.println("A girafa foi inserida com sucesso!");
	}
    
    public void listarGirafas(int id) {
    	
    	System.out.println("Digite o id da girafa a ser procurada:");
    	id = ler.nextInt();
    	System.out.println("Os dados da girafa são:");
	}
    
    @Override
    public void quantidadeDeAnimaisCadastrados() {
	    System.out.println("o numero de girafas cadastradas é:");	
	}
}
