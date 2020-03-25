package br.fai.aula1803;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cavalo extends Animal {
	Scanner ler = new Scanner(System.in);
	Serializable c = "";
	String tipo = "Cavalo";

	public String getTipo() {
		return this.tipo;
	}

	public Cavalo(String nome, int id) {
		setNome(nome);
		setId(id);
	}

	public void cadastrarCavalo() {
		System.out.println("Digite o nome do cavlo:");
		c = ler.next();
		listaDeCavalos.add((Cavalo) c);
		listaDeAnimais.add((Cavalo) c);
		System.out.println("O cavalo foi inserido com sucesso!");
	}

	// @Override
	// public String toString() {

	// return " | " + this.id + " | " + this.nome;
	// }

}
