package br.fai.aula1803;

import java.util.ArrayList;
import java.util.List;

public class Cavalo extends Animal {

	String tipo = "Cavalo";

	public String getTipo() {
		return this.tipo;
	}

	public Cavalo(String nome, int id) {
		setNome(nome);
		setId(id);
		List<Cavalo> listaDeCavalos = new ArrayList<Cavalo>();
	}
	
	@Override
	public String toString() {
		
		return " | " + this.id + " | " + this.nome;
	}

}
