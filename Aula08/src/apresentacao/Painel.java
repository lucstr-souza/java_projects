package apresentacao;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Painel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public void paintComponent(Graphics g) {
		//Chão
		g.setColor(new Color(0, 100, 0));
		g.fillRect(0, 400, 800, 200);
		
		
		//Céu
		g.setColor(new Color(173, 216, 230));
		g.fillRect(0, 0, 800, 400);
		
		//Sol
		g.setColor(new Color (255, 174, 105));
		g.fillOval(650, 30, 100, 100);
		g.setColor(new Color (253, 253, 150));
		g.fillOval(660, 40, 80, 80);
		
		//Casa -- frente
		g.setColor(Color.black);
		g.drawRect(100, 350, 100, 100);
		
		// Casa -- telhado frente
		g.setColor(Color.black);
		g.drawLine(100, 350, 150, 300);
		g.drawLine(200, 350, 150, 300);
		
		// Casa -- Linhas tridimensionais
		g.drawLine(200, 450, 350, 400);
		g.drawLine(200, 350, 350, 300);
		g.drawLine(350, 300, 350, 400);
		
		// Casa -- telhado lateral
		g.drawLine(150, 300, 320, 250);
		g.drawLine(350, 300, 320, 250);
		
		//Boneco
		g.fillOval(650, 350, 30, 30); 		// Cabeça
		g.drawLine(665, 380,665, 430); 		//Tronco
		g.drawLine(640, 395,690, 395); 		//Braço 
		g.drawLine(665, 430, 640, 460); 	//Perna esquerda
		g.drawLine(665, 430, 690, 460);  	// Perna direita
	}

}
