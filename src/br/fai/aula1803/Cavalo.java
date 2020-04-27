package br.fai.aula1803;

import java.util.ArrayList;
import java.util.List;

public class Cavalo extends Animal {

	public Cavalo(int id, String nome) {
		setId(id);
		setNome(nome);

		incrementarIdUnico();
	}
}
