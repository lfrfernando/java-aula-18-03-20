package br.fai.aula1803;

import java.util.ArrayList;
import java.util.Scanner;

public class Girafa extends Animal {
	Scanner ler = new Scanner(System.in);

	String tipo = "Girafa";

	public String getTipo() {
		return this.tipo;
	}

	public Girafa(String nome, int id) {
		setNome(nome);
		setId(id);
	}
	
//	@Override
//	public String toString() {
//		
//		return " | " + this.id + " | " + this.nome;
//	}

}
