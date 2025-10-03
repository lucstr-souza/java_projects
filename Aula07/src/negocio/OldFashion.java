package negocio;

public class OldFashion extends Drink implements Mixer {
	public void misturar() {
		super.adicionar(new Ingrediente ("Whiskey", 50, "ml"));
		super.adicionar(new Ingrediente ("Bitter", 3, "gotas"));
		super.adicionar(new Ingrediente ("Laranja", 1, "rodela"));
		super.adicionar(new Ingrediente ("Gelo", 1, "bola"));
	}
}
