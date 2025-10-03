package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Uf;

public class VisaoPessoa extends JFrame {//Primeiro passo
	//Propriedades da classe (especifíca)
	private static final long serialVersionUID = 1L; //Segundo passo
	
	//Propriedades da classe (outras -- privadas) -- Terceiro passo
	//Criar caixa de texto -- nome
	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();
	
	//Criar alternativa de sexo
	private JLabel lblSexo = new JLabel("Sexo");
	private ButtonGroup btgSexo = new ButtonGroup();
	private JRadioButton optMasculino = new JRadioButton("Masculino");
	private JRadioButton optFeminino = new JRadioButton("Feminino");
	private JRadioButton optNaoBinario = new JRadioButton("Não Binário");
	
	//criar caixa de texto -- endereço
	private JLabel lblEndereco = new JLabel("Endereço");
	private JTextField txtEndereco = new JTextField();
	
	//Criar caixa de selção -- UF
	private JLabel lblUf = new JLabel("UF");
	private JComboBox<String> cboUf = new JComboBox<String>();
	
	//Criar botão 
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	//Método principal de execução da classe
	public static void main(String[] args) {
		new VisaoPessoa().setVisible(true);
	}
	
	//Método construtor da classe
	public VisaoPessoa() {
		//Configuração da janela
		setTitle("Cadastro de Pessoas");
		setSize(400, 290);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		// Configuração do nome
		lblNome.setBounds(10, 10, 200, 20);
		add(lblNome);
		txtNome.setBounds(10, 30, 365, 20);
		add(txtNome);
		
		//Configuração do sexo
		lblSexo.setBounds(10, 60, 200, 20);
		add(lblSexo);
		optMasculino.setBounds(10,80,100,20);
		add(optMasculino);
		optFeminino.setBounds(110,80,100,20);
		add(optFeminino);
		optNaoBinario.setBounds(210, 80, 100, 20);
		add(optNaoBinario);
		btgSexo.add(optMasculino);
		btgSexo.add(optFeminino);
		btgSexo.add(optNaoBinario);
		optMasculino.setSelected(true);
		
		//Cinfiguração endereço
		lblEndereco.setBounds(10, 110, 200, 20);
		add(lblEndereco);
		txtEndereco.setBounds(10, 130, 365, 20);
		add(txtEndereco);
		
		//Configuração da uf
		lblUf.setBounds(10, 160, 200, 20);
		add(lblUf);
		cboUf.setBounds(10, 160, 80, 20);
		add(cboUf);
		cboUf.addItem("---");
		try {
			for (Uf objUf: Uf.getTodos()) {
				cboUf.addItem(objUf.getSigla());		
			}
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		//Configuração botões
		btnSair.setBounds(20, 210, 100, 30);
		add(btnSair);
		btnSair.addActionListener(new ControladorSair());
		
		btnLimpar.setBounds(140, 210, 100, 30);
		add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(txtNome, optMasculino, txtEndereco, cboUf));
		
		btnGravar.setBounds(260, 210, 100, 30);
		add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(txtNome, optMasculino, optFeminino, txtEndereco, cboUf));
		
		
		
	}
}
