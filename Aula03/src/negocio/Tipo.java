package negocio;

public class Tipo {
	//Propriedades da classe
	private String descricao = "";
	
	//Métodos contrutores da classe
	public Tipo() {
		
	}
	
	public Tipo(String descricao) {
		this.descricao = descricao;
	}
	//Métodos de acesso da classe

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
