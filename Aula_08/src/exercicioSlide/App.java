package exercicioSlide;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//Instances
		Scanner teclado = new Scanner(System.in);
		Clientes cliente;
		
		//Array
		List<Clientes> arrayClient = new ArrayList<Clientes>();
		
		//Variables
		String nome, telefone;
		int idade, escolha;
		boolean teste = true;
		
		do {
			
		System.out.println("O que gostaria fazer? 1 - Adicionar cliente | 2 - Listar clientes | 3 - Fim");
		escolha = teclado.nextInt();
		
		if(escolha == 1) {
			
			cliente = new Clientes();
			System.out.println("Digite o nome do cliente");
			nome = teclado.next();
			
			System.out.println("Digite a idade do cliente");
			idade = teclado.nextInt();
			
			System.out.println("Digite o telefone do cliente");
			telefone = teclado.next();
			
			arrayClient.add(cliente);
			
			cliente.setNome(nome);
			cliente.setIdade(idade);
			cliente.setTelefone(telefone);
			
			System.out.println("E agora? 1 - Adicionar cliente | 2 - Listar clientes | 3 - Fim");
			escolha = teclado.nextInt();
			
		} else if (escolha == 2) {
			
			for(Clientes a: arrayClient) {
				a.getNome();
				
				System.out.println("O que gostaria fazer? 1 - Adicionar cliente | 2 - Listar clientes | 3 - Fim");
				escolha = teclado.nextInt();
			}
			
		} else if (escolha == 3) {
			
			System.out.println("Processo finalizado");
		}
		}while(teste == false);
		
	}

}
