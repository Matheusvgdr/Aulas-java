package visao;

public class Menu {
	
	public void desenharMenu() {
		
		System.out.println("----------- MENU -------------");
		System.out.println("0 - Criar clientes para teste");
		System.out.println("1 - Adicionar cliente");
		System.out.println("2 - Listar clientes");
		System.out.println("3 - Média de idades dos clientes");
		System.out.println("4 - Alterar cliente");
		System.out.println("5 - Excluir cliente");
		System.out.println("6 - Avaliar cliente");
		System.out.println("7 - Visualizar clientes Master");
		System.out.println("8 - Fim");
		System.out.println("------------------------");
		System.out.println("Digite uma opção");
		
	}
	
	public void terminarProcesso() {
		
		System.out.println("Processo finalizado");
	}
	
	public void exibirErro() {
		System.out.println("Erro na seleção da opção, digite novamente");
	}
}
