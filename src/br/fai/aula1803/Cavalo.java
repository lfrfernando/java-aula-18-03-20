package br.fai.aula1803;

public class Cavalo extends Animal {

	String tipo = "Cavalo";

	public String getTipo() {
		return this.tipo;
	}

	public Cavalo(String nome, int id) {
		setNome(nome);
		setId(id);
	}
	
	@Override
	public String toString() {
		
		return " | " + this.id + " | " + this.nome;
	}

}
