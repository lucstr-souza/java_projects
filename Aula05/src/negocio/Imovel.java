package negocio;

public class Imovel {
	//Propriedades da classe
	private String endereco = "";
	private double metragem = 0;
	private double preco = 0;
	
	//Métodos construtores da classe
	public Imovel() {
		super();
	}

	public Imovel(String endereco, double metragem, double preco) {
		super();
		this.endereco = endereco;
		this.metragem = metragem;
		this.preco = preco;
	}

	//Métodos de acesso da classe
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getMetragem() {
		return metragem;
	}

	public void setMetragem(double metragem) {
		this.metragem = metragem;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	

}
