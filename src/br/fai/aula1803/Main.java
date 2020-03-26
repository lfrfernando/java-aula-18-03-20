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

	//List<Animal> listaDeAnimais = new ArrayList<Animal>();
	List<Cavalo> listaDeCavalos = new ArrayList<Cavalo>();
	List<Girafa> listaDeGirafas = new ArrayList<Girafa>();
	List<Animal> listaDeAnimais = new ArrayList<Animal>(listaDeCavalos.size() + listaDeGirafas.size());
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
				System.out.println("Nome:");
				String nomeDoCavalo = ler.next();
				System.out.println("id: ");
				int idCavalo = ler.nextInt();
				cadastrarCavalo(nomeDoCavalo, idCavalo);
				
				System.out.println("Cavalo cadastrado!");
				// cadastrarCavalo();

				break;

			case 2:
				System.out.println("Nome:");
				String nomeDaGirafa = ler.next();
				System.out.println("id: ");
				int idGirafa = ler.nextInt();
				cadastrarGirafa(idGirafa,nomeDaGirafa);
				System.out.println("Girafa cadastrada!");
				// cadastrarGirafa();

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
				System.out.println("Digite o id do animal a ser removido: ");
				int numero = ler.nextInt();
				removerAnimalPorId(numero);
				System.out.println("Animal removido com sucesso da lista!");

//				
//				for (Animal animal : listaDeAnimais) {
//					Animal a = (Animal) animal;
//					System.out.println("Id do animal: ");
//					a.id = ler.nextInt();
//					listaDeAnimais.remove(a);
//
//				}

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

	public void cadastrarCavalo(String nome, int id) {
		Cavalo cavalo = new Cavalo(nome, id);

		listaDeCavalos.add(cavalo);

	}

	public void cadastrarGirafa(int idGirafa, String nomeDaGirafa) {
		Girafa girafa = new Girafa(idGirafa, nomeDaGirafa);

		listaDeGirafas.add(girafa);

	}

	public void listarCavalos() {

		for (Cavalo cavalo : listaDeCavalos) {
			System.out.println("ID_DO_CAVALO: " + cavalo.getId() + " | " + "NOME_DO_CAVALO: " + cavalo.getNome());
		}

	}

	public void listarGirafas() {
		for (Girafa girafa : listaDeGirafas) {
			System.out.println("ID_DA_GIRAFA: " + girafa.getId() + " | " + "NOME_DA_GIRAFA: " + girafa.getNome());
		}

	}

	public void listarTodosAnimais() {
		listaDeAnimais.addAll(listaDeCavalos);
		listaDeAnimais.addAll(listaDeGirafas);

		for (Animal animal : listaDeAnimais) {
			System.out.println("ID_DO_ANIMAL: " + animal.getId() + " | " + "NOME_DO_ANIMAL: " + animal.getNome());
		}

	}

	public void removerAnimalPorId(int numero) {
		listaDeAnimais.removeIf(id -> id.equals(numero));

	}

	public void quantidadeDeAnimaisPorTipo() {
		System.out.println("Número de cavalos cadastrados: " + listaDeCavalos.size());
		listarCavalos();
		System.out.println("Número de girafas cadastradas: " + listaDeGirafas.size());
		listarGirafas();
		System.out.println("Total de animais cadastradas: " + listaDeAnimais.size());

	}

}