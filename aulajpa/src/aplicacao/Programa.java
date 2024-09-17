package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1, "Carlos da silva", "carlos@gmail");
		Pessoa p2 = new Pessoa(2, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(3, "Ana Maria", "maria@gmail.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
	

}
