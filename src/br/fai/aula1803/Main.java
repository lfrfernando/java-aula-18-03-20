package br.fai.aula1803;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.start();

	}

	Scanner ler = new Scanner(System.in);
	Serializable c = "";
	List<Animal> listaDeAnimais = new ArrayList<Animal>();
	List<Cavalo> listaDeCavalos = new ArrayList<Cavalo>();
	List<Girafa> listaDeGirafas = new ArrayList<Girafa>();
//	Cavalo c1 = new Cavalo("Marchador", 123);
//	Cavalo c2 = new Cavalo("Manga larga", 456489);
//	Cavalo c3 = new Cavalo("DUck", 65412);
//
//	Girafa g1 = new Girafa("Gorda", 15896);
//	Girafa g2 = new Girafa("Magra", 6556);
//	Girafa g3 = new Girafa("Pescoçuda", 56431);

	private void start() {
		// TODO Auto-generated method stub
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
				cadastrarCavalo();

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
	
	
	public void cadastrarCavalo() {
		System.out.println("Digite o nome do cavalo:");
		c = ler.next();
		System.out.println("Digite o id do cavalo:");
		c = ler.nextInt();
		listaDeCavalos.add((Cavalo) c);
		listaDeAnimais.add((Cavalo) c);
		System.out.println("O cavalo foi inserido com sucesso!");
	}


//  public void cadastrarCavalo() {
//
//		listaDeCavalos.add(c1);
//		listaDeCavalos.add(c2);
//		listaDeCavalos.add(c3);
//
//		listaDeAnimais.add(c1);
//		listaDeAnimais.add(c2);
//		listaDeAnimais.add(c3);
//
//		System.out.println("O cavalo foi inserido com sucesso!");
//		System.out.println(" ");
//
//}

//	public void cadastrarGirafa() {
//
//		listaDeGirafas.add(g1);
//		listaDeGirafas.add(g2);
//		listaDeGirafas.add(g3);
//
//		listaDeAnimais.add(g1);
//		listaDeAnimais.add(g2);
//		listaDeAnimais.add(g3);
//
//		System.out.println("A girafa foi inserido com sucesso!");
//		System.out.println(" ");
//
//	}
}
