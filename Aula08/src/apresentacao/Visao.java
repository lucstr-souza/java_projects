package apresentacao;

import javax.swing.JFrame;

public class Visao extends JFrame { //Primeiro passo
	//Propriedades da classe (especifíca)
	private static final long serialVersionUID = 1L; //Segundo passo

	//Propriedades da classe (outras) -- Terceiro passo
	private Painel objPainel = new Painel();		
	
	//Método principal de execução da classe -- Quarto passo
	public static void main(String[] args) {
		new Visao().setVisible(true);
	}
	
	//Método construtor da classe
	public Visao() {
		//Configuração da janela -- Quinto passo
		setTitle("Minha primeira janela java !!!"); 	//Título da janela (sempre precisa ter)
		setSize(800,600); 		//Tamanho da janela
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//O que acontece quando eu fecho a janela
		setLocationRelativeTo(null);	//Onde vai aparecer a janela 	
		setLayout(null); 	//Layout (podemos desenhar)
		
		//Configuração do painel -- Sexto passo
		setContentPane(objPainel);
	}
}
