package apresentacao;

import negocio.Pessoa;

public class Visao {
	public static void main(String[] args) {

		Pessoa obj1= new Pessoa();

		obj1.setNome("Luisa");

		obj1.setEndereco("sobradinho");

		obj1.setTelefone("99290");

		

		System.out.println("Nome"+obj1.getNome());

		System.out.println("Endereco"+obj1.getEndereco());

		System.out.println("Telefone"+obj1.getTelefone());

		

		

		Pessoa obj2= new Pessoa("Fulano", "Asa Norte", "234-5678");

		

		System.out.println("Nome"+obj2.getNome());

		System.out.println("Endereco"+obj2.getEndereco());

		System.out.println("Telefone"+obj2.getTelefone());

	}
}
