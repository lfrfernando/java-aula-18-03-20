package br.fai.aula1803;

import java.util.ArrayList;
import java.util.List;

public class Girafa extends Animal {

	String tipo = "Girafa";

	public String getTipo() {
		return this.tipo;
	}

	public  Girafa(int id, String nome) {
		
		setNome(nome);
		setId(id);
		List<Girafa> listaDeGirafas = new ArrayList<Girafa>();
		
}
	
	@Override
	public String toString() {
		
		return " | " + this.id + " | " + this.nome;
	}

}
