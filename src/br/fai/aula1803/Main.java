package br.fai.aula1803;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import br.fai.aula1803.Animal;
import br.fai.aula1803.Cavalo;
import br.fai.aula1803.Girafa;

/**
 * Exercicio do dia 18-03-2020
 * 
 * @author lucianovilela
 *
 */
public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();
	}

	private final int OPCAO_INVALIDA = 9;
	private Scanner scanner = new Scanner(System.in);
	private List<Animal> animais = new ArrayList<Animal>();

	/**
	 * Execucao do programa
	 * 
	 * @author lucianovilela
	 */
	private void start() {

		boolean emExecucao = true;
		while (emExecucao) {

			exibirMenu();

			int opcao = OPCAO_INVALIDA;

			try {
				opcao = scanner.nextInt();
				scanner.nextLine();
			} catch (Exception e) {

				scanner.next();
				System.out.println("Ocorreu um erro ao tentar obter entrada do usuario. Tente novamente.");
				System.out.println("----");

				continue;
			}

			switch (opcao) {
			case 1:
				cadastrarCavalo();
				break;
			case 2:
				cadastrarGirafa();
				break;
			case 3:
				listarCavalos();
				break;
			case 4:
				listarGirafas();
				break;
			case 5:
				listarTodosAnimais();
				break;
			case 6:
				try {
					System.out.println("----");
					System.out.print("Digite o ID do animal a ser removido: ");
					int idDoAnimal = scanner.nextInt();
					removerAnimalPorId(idDoAnimal);
				} catch (Exception e) {

					scanner.next();
					System.out.println("Ocorreu um erro ao tentar obter entrada do usuario. Tente novamente.");
				}
				break;
			case 7:
				exibirQuantidadeDeAnimaisPorTipo();
				break;
			case 8:
				emExecucao = false;
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}

			System.out.println("----");

		}
		System.out.println("Fim =D");
	}

	/**
	 * Exibe o menu
	 * 
	 * @author lucianovilela
	 */
	private void exibirMenu() {

		System.out.println("1. Cadastrar cavalo");
		System.out.println("2. Cadastrar girafa");
		System.out.println("3. Listar cavalos");
		System.out.println("4. Listar girafas");
		System.out.println("5. Listar todos os animais");
		System.out.println("6. Remover um animal por id");
		System.out.println("7. Exibir a quantidade de animais por tipo");
		System.out.println("8. Sair");
		System.out.print("Sua opção: ");
	}

	/**
	 * Cadastra o cavalo.
	 * 
	 * @author lucianovilela
	 */
	private void cadastrarCavalo() {

		System.out.println("----");
		System.out.print("Digite o nome do cavalo: ");

		// 1. Obtem o nome do cavalo
		String nome = scanner.nextLine();

		// 2. Antes de ganhar a instancia do cavalo, chama o metodo estatico
		// da classe Animal para obter o id unico
		// 3. Ganha a instancia do cavalo passando os parametros necessarios
		Cavalo cavalo = new Cavalo(Animal.getIdUnico(), nome);

		// 4. Adiciona o cavalo na lista
		animais.add(cavalo);

		// 5. Exibe a mensagem de sucesso
		System.out.println("O cavalo foi inserido com sucesso.");
	}

	/**
	 * Cadastra a girafa.
	 * 
	 * @author lucianovilela
	 */
	private void cadastrarGirafa() {

		System.out.println("----");
		System.out.print("Digite o nome da girafa: ");

		// 1. Obtem o nome da girafa
		String nome = scanner.nextLine();

		// 2. Antes de ganhar a instancia da girafa, chama o metodo estatico
		// da classe Animal para obter o id unico
		// 3. Ganha a instancia da girafa passando os parametros necessarios
		Girafa girafa = new Girafa(Animal.getIdUnico(), nome);

		// 4. Adiciona a girafa na lista
		animais.add(girafa);

		// 5. Exibe a mensagem de sucesso
		System.out.println("A girafa foi inserida com sucesso.");
	}

	/**
	 * Lista somente os cavalos
	 * 
	 * @author lucianovilela
	 */
	private void listarCavalos() {

		System.out.println("----");
		if (animais.size() == 0) {
			System.out.println("Nenhum animal cadastrado.");
			return;
		}

		// itera cada animal da lista
		for (Animal animal : animais) {

			// caso o animal seja da classe Cavalo, exibe seus dados
			if (animal instanceof Cavalo) {
				System.out.println("Dados do cavalo: " + animal.getId() + " | " + animal.getNome());
			}
		}
	}

	/**
	 * Lista somente as girafas
	 * 
	 * @author lucianovilela
	 */
	private void listarGirafas() {

		System.out.println("----");
		if (animais.size() == 0) {
			System.out.println("Nenhum animal cadastrado.");
			return;
		}

		// itera cada animal da lista
		for (Animal animal : animais) {

			// caso o animal seja da classe Girafa, exibe seus dados
			if (animal instanceof Girafa) {
				System.out.println("Dados da girafa: " + animal.getId() + " | " + animal.getNome());
			}
		}
	}

	/**
	 * Lista todos os animais
	 * 
	 * @author lucianovilela
	 */
	private void listarTodosAnimais() {

		System.out.println("----");
		if (animais.size() == 0) {
			System.out.println("Nenhum animal cadastrado.");
			return;
		}

		// itera cada animal da lista
		for (Animal animal : animais) {

			// exibe os dados dos animais
			System.out.println("Dados do animal: " + animal.getId() + " | " + animal.getNome());
		}
	}

	/**
	 * Remove um animal da lista atraves de seu id - Método simples de entender
	 * 
	 * @param idDoAnimal
	 * @author lucianovilela
	 */
	private void removerAnimalPorId(int idDoAnimal) {

		/*
		 * variavel que vai armazenar a posicao do do animal na lista para poder
		 * remove-lo posteriormente
		 */
		int indiceDaListaDeAnimais = -1;

		// itera a lista de animais
		for (int i = 0; i < animais.size(); i++) {

			// obtem o animal na posicao em questao
			Animal animal = animais.get(i);

			/*
			 * Caso o ID do animal seja igual ao que foi passado no parametro, coloca a
			 * posicao do animal na lista em sua variavel e sai do laco logo em seguida.
			 */
			if (animal.getId() == idDoAnimal) {
				indiceDaListaDeAnimais = i;
				break;
			}
		}

		/*
		 * Caso o valor seja diferente do -1 (pois ele eh invalido), remove o animal
		 */
		if (indiceDaListaDeAnimais != -1) {
			animais.remove(indiceDaListaDeAnimais);
			System.out.println("Animal removido com sucesso.");
		} else {
			System.out.println("Não há nenhum animal com este ID. Tente novamente.");
		}
	}

	/**
	 * Exibe quantidade de animais cadastrados, formatando a exibicao do resultado
	 * conforme pede o exercicio
	 * 
	 * @author lucianovilela
	 */
	private void exibirQuantidadeDeAnimaisPorTipo() {

		System.out.println("----");
		if (animais.size() == 0) {
			System.out.println("Nenhum animal cadastrado.");
			return;
		}

		// cria-se duas chaves para acessar o mapa
		// o termo final eh usado para tornar esta variavel uma constante, ou seja, nao
		// pode ser alterada
		final String chaveCavalo = "CAVALO";
		final String chaveGirafa = "GIRAFA";

		/*
		 * ganha uma instancia do mapa, a qual vai entregar uma lista de animais de
		 * acordo com a chave desejada
		 */
		Map<String, List<Animal>> mapaDeAnimais = new HashMap<String, List<Animal>>();

		// insere para cada chave do mapa uma instancia da lista de animais
		mapaDeAnimais.put(chaveCavalo, new ArrayList<Animal>());
		mapaDeAnimais.put(chaveGirafa, new ArrayList<Animal>());

		// itera a lista de animais
		for (Animal animal : animais) {

			// caso ele seja Cavalo
			if (animal instanceof Cavalo) {

				// 1. acessa o mapa atraves de sua chave, o qual retorna uma lista
				// 2. com a lista na mao, chama seu metodo add
				List<Animal> listaDeCavalos = mapaDeAnimais.get(chaveCavalo);
				listaDeCavalos.add(animal);

			}
			// caso ele seja girafa
			else if (animal instanceof Girafa) {

				// 1. a linha abaixo eh identica ao do cavalo acima, porem
				// ela foi simplificada
				mapaDeAnimais.get(chaveGirafa).add(animal);
			}
		}

		// -----------------------------------------------------
		// acessa o mapa utilizando-se de sua chave e retorna a lista de cavalos
		List<Animal> listaDeCavalos = mapaDeAnimais.get(chaveCavalo);

		// 1. o termo final eh usado para tornar esta variavel uma constante, ou seja,
		// nao pode ser alterada
		// 2. obtem o tamanho da lista de cavalos
		final int numeroDeCavalosCadastrados = listaDeCavalos.size();

		// exibe o numero de cavalos cadastrados
		System.out.println("Número de cavalos cadastrados: " + numeroDeCavalosCadastrados);

		// itera a lista
		for (Animal animal : mapaDeAnimais.get(chaveCavalo)) {

			// exibe os dados do cavalo
			System.out.println("Dados do cavalo: " + animal.getId() + " | " + animal.getNome());
		}

		// -----------------------------------------------------
		// 1. o termo final eh usado para tornar esta variavel uma constante, ou seja,
		// nao pode ser alterada
		// 2. a linha abaixo eh identica a do cavalo acima, porem foi simplificada
		final int numeroDeGirafasCadastradas = mapaDeAnimais.get(chaveGirafa).size();

		// exibe o numero de giradas cadastradas
		System.out.println("Número de girafas cadastradas: " + numeroDeGirafasCadastradas);

		// itera a lista
		for (Animal animal : mapaDeAnimais.get(chaveGirafa)) {

			// exibe os dados da girada
			System.out.println("Dados da girafa: " + animal.getId() + " | " + animal.getNome());
		}
	}

}