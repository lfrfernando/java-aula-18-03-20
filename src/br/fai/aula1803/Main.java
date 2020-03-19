package br.fai.aula1803;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.start();

	}

	private void start() {
		// TODO Auto-generated method stub
        Scanner ler = new Scanner(System.in);
		int opcao = 0;
		
		do {
			System.out.println("1. Cadastrar cavalo");
			System.out.println("2. Cadastrar girafa");
			System.out.println("3. Listar cavalos");
			System.out.println("4. Listar girafass");
			System.out.println("5. Listar todos os animais");
			System.out.println("6. Remover umanimal por id");
			System.out.println("7. Exibir a quantidade de animais cadastrados por tipo");
			System.out.println("8. Sair");
			System.out.println("\nEscolha uma opção:");
			opcao = ler.nextInt();
			
			if(opcao == 1){
		        System.out.println("Entre com o numero de vezes que o dado deve ser jogado: ");
		        
		        }
		        
		        if(opcao == 2){
		        System.out.println("Vamos cadastrar o cavalo: ");
		        }
		     
		        if(opcao == 3){
			        System.out.println("vamos cadastar a girafa: ");
			    }
		        if(opcao == 4){
			        System.out.println("A lista de girafas contém: ");
			    }
		        if(opcao == 5){
			        System.out.println("A lista de todos animais contém: ");
			    }
		        if(opcao == 6){
			        System.out.println("Digite o id de qual animal deseja remover da lista:");
			    }
		        if(opcao == 7){
			        System.out.println("vamos exibir a lista de animais cadastrados por tipo");
			    }
		        //System.out.println("O volume da esfera é: " + esfera.CalculoVolume());
		        
		        if(opcao == 8){
		        System.out.println("\nFim programa!");
		        System.out.println("Obrigado por utilizar!\n");
		        }
		
		}while(opcao == 8);
		
	}
}
