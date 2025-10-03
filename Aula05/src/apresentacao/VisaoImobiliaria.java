package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Imovel;
import negocio.Novo;
import negocio.Usado;

public class VisaoImobiliaria {
	public static void main(String[] args) {
	//Declaraçãode variáveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Imovel objImovel = null;
		String opcao = "";
		
		//Entrada de dados
		try {
			System.out.print("Digite o tipo do imóvel");
			opcao = leitor.readLine();
			
			if (opcao.equalsIgnoreCase("novo")) {
				objImovel = new Novo();
			}else {
				objImovel = new Usado();
			}
			
			System.out.print("Digite o endereço: ");
			objImovel.setEndereco(leitor.readLine());
			
			System.out.print("Digite a metragem: ");
			objImovel.setMetragem(Double.parseDouble(leitor.readLine()));	
			
			System.out.print("Digite o preço: ");
			objImovel.setPreco(Double.parseDouble(leitor.readLine()));
			
			if (opcao.equalsIgnoreCase("novo")) {
				System.out.print("Digite o adicional: ");
				((Novo) objImovel).setAdicional(Double.parseDouble(leitor.readLine()));
			}else {
				System.out.print("Digite a depreciação: ");
				((Usado) objImovel).setDepreciacao(Double.parseDouble(leitor.readLine()));
			}
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		//Saída de dados
		System.out.println("Endereço: " + objImovel.getEndereco());
		System.out.println("Metragem: " + objImovel.getMetragem());
		System.out.println("Preço: " + objImovel.getPreco());


	}
}
