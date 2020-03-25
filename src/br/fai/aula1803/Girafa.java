package br.fai.aula1803;

public class Girafa extends Animal {

	String tipo = "Girafa";

	public String getTipo() {
		return this.tipo;
	}

	public Girafa(String nome, int id) {
		setNome(nome);
		setId(id);
	}
	
	@Override
	public String toString() {
		
		return " | " + this.id + " | " + this.nome;
	}

}
