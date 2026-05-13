package Entidade;

public class Ingresso {

	private double valor;
	private int numeroAssento;
	private TipoIngresso tipoIngresso;
	private Boolean pagamento;
	private Evento evento;
	
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getNumeroAssento() {
		return numeroAssento;
	}
	public void setNumeroAssento(int numeroAssento) {
		this.numeroAssento = numeroAssento;
	}
	public TipoIngresso getTipoIngresso() {
		return tipoIngresso;
	}
	public void setTipoIngresso(TipoIngresso tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}
	public Boolean getPagamento() {
		return pagamento;
	}
	public void setPagamento(Boolean pagamento) {
		this.pagamento = pagamento;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	
}
