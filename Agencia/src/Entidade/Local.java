package Entidade;
public class Local {

	private String nome;
	private int capacidade;
	private String endereco;
	private Estrutura estrutura;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
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
	
	
}
