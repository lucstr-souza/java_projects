package negocio;

public class Livro {

	//Propriedades da classe
	private String titulo = "";
	private Autor objAutor = null;
	private String genero = "";
	
	//Métodos construtores da classe
	public Livro() {
		super();
	}

	public Livro(String titulo, Autor objAutor, String genero) {
		super();
		this.titulo = titulo;
		this.objAutor = objAutor;
		this.genero = genero;
	}

	//Métodos de acesso da classe
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getObjAutor() {
		return objAutor;
	}

	public void setObjAutor(Autor objAutor) {
		this.objAutor = objAutor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	
}
