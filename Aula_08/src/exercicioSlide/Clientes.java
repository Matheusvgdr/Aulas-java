package exercicioSlide;

public class Clientes {

	private String nome;
	private String telefone;
	private int idade;
	private String estrelas;
	
	public String getEstrelas() {
		return estrelas;
	}
	
	public void setEstrelas(String estrelas) {
		this.estrelas = estrelas;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " / Idade: " + idade + " / Telefone: " + telefone ;
	}
	
	

}
