package negocio;

public abstract class Drink {
	//Propriedades da classe
	private Ingrediente[] colecao = new Ingrediente[10];
	private int quantidade = 0;
	
	//Métodos da classe
	public void adicionar(Ingrediente objIngrediente) {
		colecao [quantidade] = objIngrediente;
		quantidade++;
	}
	
	public void beber() {
		for (int i = 0; i< quantidade ; i++) {
			System.out.println(colecao [i].getQuantidade() + colecao[i].getUnidade() +  " de " + colecao[i].getNome());
		}
		
	}
}
