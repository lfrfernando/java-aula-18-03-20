package br.fai.aula1803;



public class Girafa extends Animal {

	public Girafa(int id, String nome) {
		setId(id);
		setNome(nome);

		incrementarIdUnico();
	}
}