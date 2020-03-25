package br.fai.aula1803;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

	List<Animal> listaDeAnimais = new ArrayList<Animal>();
	List<Cavalo> listaDeCavalos = new ArrayList<Cavalo>();
	List<Girafa> listaDeGirafas = new ArrayList<Girafa>();

	private int id;
	private String nome;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
