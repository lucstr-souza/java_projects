package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Aluno;
import negocio.Cadeira;
import negocio.Professor;
import negocio.Turma;

public class Visao {
	public static void main(String[] args) {
		//Declaração de variáveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Turma objTurma = new Turma();
		Professor objProfessor = new Professor();
		
		//Entrada de dados
		try {
			System.out.print("Digite o nome da cadeira: ");
			objTurma.setObjCadeira(new Cadeira(leitor.readLine()));
			
			System.out.print("Digite o nome do professor: ");
			objProfessor.setNome(leitor.readLine());
			
			System.out.print("Digite o título do professor");
			objProfessor.setTitulo(leitor.readLine());
			
			System.out.print("Digite o salário do professor: ");
			objProfessor.setSalario(Double.parseDouble(leitor.readLine()));
			
			objTurma.setObjProfessor(objProfessor); //colocar professor dentro da turma
			
			do{
				Aluno objAluno = new Aluno();
				
				System.out.print("Digite a matrícula do aluno: ");
				objAluno.setMatricula(Integer.parseInt(leitor.readLine()));
				
				System.out.print("Digite o nome do aluno: ");
				objAluno.setNome(leitor.readLine());
				
				objTurma.adicionarAluno(objAluno); //colocar aluno dentro da turma
				
				System.out.print("Tem mais alunos ?");
			}while(leitor.readLine().equalsIgnoreCase("sim"));
		}catch (Exception erro) {
			System.out.print(erro);
		}
		
		//Saída de dados
		System.out.println("Cadeira: " + objTurma.getObjCadeira().getNome());
		System.out.println("Professor: " + objTurma.getObjProfessor().getTitulo() + " " + objTurma.getObjProfessor().getNome());
		objTurma.listarAlunos();
	}
}
