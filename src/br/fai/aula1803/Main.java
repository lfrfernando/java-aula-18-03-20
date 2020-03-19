package br.fai.aula1803;

import java.util.ArrayList;
import java.util.List;
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
		
		
		List<Cavalo> listaDeCavalos = new ArrayList<Cavalo>();
		List<Girafa> listaDeGirafas = new ArrayList<Girafa>();

		int opcao = 0;

		do {
			
			System.out.println("\n1 - Cadastrar cavalo");
			System.out.println("\n2 - Cadastrar girafa");
			System.out.println("\n3 - Listar cavalos");
			System.out.println("\n4 - Listar girafass");
			System.out.println("\n5 - Listar todos os animais");
			System.out.println("\n6 - Remover umanimal por id");
			System.out.println("\n7 - Exibir a quantidade de animais cadastrados por tipo");
			System.out.println("\n8 - Sair");
			System.out.println("\nEscolha uma opção:");
			opcao = ler.nextInt();
            
			switch (opcao) {
			case 1:

				break;

			case 2:

				break;

			case 3:

				break;

			case 4:

				break;

			case 5:

				break;

			case 6:

				break;

			case 7:

				break;

			case 8:
				System.out.println("\nFim programa!");
				System.out.println("Obrigado por utilizar!\n");
				break;

			default:

				break;
			} 

		} while (opcao == 8); 

	} 
} 


