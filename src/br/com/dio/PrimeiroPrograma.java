package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		int a = 2;
		int b = 5;
		System.out.println("Hello World!" + (a+b));
		*/
		
		Gato gato = new Gato(null, null, null);
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);

	}
	
}

class Livros {
	private String nome;
	private String npag;
	
}
