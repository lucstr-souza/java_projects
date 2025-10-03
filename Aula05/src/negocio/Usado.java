package negocio;

public class Usado extends Imovel {
	//Propriedades da classe
	private double depreciacao = 0;

	//Métodos construtores da classe
	public Usado() {
		super();
	}

	public Usado(String endereco, double metragem, double preco, double depreciacao) {
		super(endereco, metragem, preco);
		this.depreciacao = depreciacao;
	}

	//Métodos de acesso da classe
	public double getDepreciacao() {
		return depreciacao;
	}

	public void setDepreciacao(double depreciacao) {
		this.depreciacao = depreciacao;
	}

	//Métodos sobrescritos da classe
	public double getPreco(){
		return(super.getPreco() - this.getDepreciacao());
	}
	
}
