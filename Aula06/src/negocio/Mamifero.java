package negocio;

public class Mamifero extends Animal {
	//Prpriedades da classe
	private int litrosLeite = 0;

	//Métodos construtores da classe
	public Mamifero() {
		super();
	}

	public Mamifero(double peso, double altura, String nome, int litrosLeite) {
		super(peso, altura, nome);
		this.litrosLeite = litrosLeite;
	}

	//Métodos de acesso da classe
	public double getLitrosLeite() {
		return litrosLeite;
	}

	public void setLitrosLeite(int litrosLeite) {
		this.litrosLeite = litrosLeite;
	}
	
	
}
