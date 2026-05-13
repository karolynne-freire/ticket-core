package Entidade;
public class Local {

	private String nome;
	private String endereco;
	private Estrutura estrutura;
	private int capacidadeMaxima;
	
	
	
	public Local() {
		super();
	}

	public Local(String nome, String endereco, Estrutura estrutura, int capacidadeMaxima) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.estrutura = estrutura;
		this.capacidadeMaxima = capacidadeMaxima;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Estrutura getEstrutura() {
		return estrutura;
	}
	public void setEstrutura(Estrutura estrutura) {
		this.estrutura = estrutura;
	}
	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	
	
}
