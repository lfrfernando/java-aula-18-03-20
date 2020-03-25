package br.fai.aula1803;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();

	}

	Scanner ler = new Scanner(System.in);

	List<Animal> listaDeAnimais = new ArrayList<Animal>();
	List<Cavalo> listaDeCavalos = new ArrayList<Cavalo>();
	List<Girafa> listaDeGirafas = new ArrayList<Girafa>();

	private void start() {

		int opcao = 0;

		do {

			System.out.println("\n1 - Cadastrar cavalo");
			System.out.println("\n2 - Cadastrar girafa");
			System.out.println("\n3 - Listar cavalos");
			System.out.println("\n4 - Listar girafass");
			System.out.println("\n5 - Listar todos os animais");
			System.out.println("\n6 - Remover um animal por id");
			System.out.println("\n7 - Exibir a quantidade de animais cadastrados por tipo");
			System.out.println("\n8 - Sair");
			System.out.println("\nEscolha uma opção:");
			opcao = ler.nextInt();

			switch (opcao) {

			case 1:
				cadastrarCavalo();

				break;

			case 2:
				cadastrarGirafa();

				break;

			case 3:
				for (Animal animal : listaDeCavalos) {

					System.out.println("Dados do cavalo: " + animal);

				}

				// listarCavalos();

				break;

			case 4:
				for (Animal animal : listaDeGirafas) {

					System.out.println("Dados da girafa: " + animal);

				}
				// listarGirafas();

				break;

			case 5:

				for (Animal animais : listaDeAnimais) {
					if (animais instanceof Cavalo) {
						Cavalo c = (Cavalo) animais;
						System.out.println("Dados do animal: " + c.getTipo() + animais);
					} else if (animais instanceof Girafa) {
						Girafa g = (Girafa) animais;
						System.out.println("Dados do animal: " + g.getTipo() + animais);
					}

				}

				break;

			case 6:
				for (Animal animal : listaDeAnimais) {
					Animal a = (Animal) animal;
					System.out.println("Id do animal: ");
					a.id = ler.nextInt();
					listaDeAnimais.remove(a);

				}

				break;

			case 7:
				System.out.println(" ");
				System.out.println("Numero de cavalos cadastrados: " + listaDeCavalos.size());
				for (Animal animal : listaDeCavalos) {

					System.out.println("Dados do cavalo: " + animal);

				}
				System.out.println(" ");
				System.out.println("Numero de girafas cadastradas: " + listaDeGirafas.size());
				for (Animal animal : listaDeGirafas) {

					System.out.println("Dados da girafa: " + animal);

				}
				System.out.println(" ");
				System.out.println("Total de animais cadastrados: " + listaDeAnimais.size());

				// quantidadeDeAnimaisPorTipo();

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

		Cavalo cav = new Cavalo(ler.next(), (listaDeCavalos.size() + 1));

		listaDeCavalos.add(cav);
		listaDeAnimais.add(cav);
		System.out.println("O cavalo foi inserido com sucesso!");
		System.out.println("Os cavalos da lista são: " + listaDeCavalos.size());

	}

	public void cadastrarGirafa() {
		System.out.println("Digite o nome da girafa:");

		Girafa gir = new Girafa(ler.next(), (listaDeGirafas.size() + 1));

		listaDeGirafas.add(gir);
		listaDeAnimais.add(gir);
		System.out.println("A girafa foi inserida com sucesso!");
	}

//	public void listarCavalos() {
//
//	}
//
//	public void listarGirafas() {
//		System.out.println("Os cavalos da lista são: " + listaDeGirafas.size());
//	}
//
//	public void listarTodosAnimais() {
//
//	}
//
//	public void removerAnimalPorId() {
//
//	}
//
//	public void quantidadeDeAnimaisPorTipo() {
//
//	}

}