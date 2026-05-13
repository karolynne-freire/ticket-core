package Entidade;

public class Ingresso {

	private double valor;
	private int numeroAssento;
	private TipoIngresso tipoIngresso;
	private Boolean pagamento;
	private Evento evento;
	private double valorPago;
	private boolean pagamentoRealizado;
	
	
	
	public Ingresso() {
		super();
	}
	
	public Ingresso(double valor, int numeroAssento, TipoIngresso tipoIngresso, Boolean pagamento, Evento evento,
			double valorPago, boolean pagamentoRealizado) {
		super();
		this.valor = valor;
		this.numeroAssento = numeroAssento;
		this.tipoIngresso = tipoIngresso;
		this.pagamento = pagamento;
		this.evento = evento;
		this.valorPago = valorPago;
		this.pagamentoRealizado = pagamentoRealizado;
	}


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
	public double getValorPago() {
		return valorPago;
	}
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	public boolean isPagamentoRealizado() {
		return pagamentoRealizado;
	}
	public void setPagamentoRealizado(boolean pagamentoRealizado) {
		this.pagamentoRealizado = pagamentoRealizado;
	}
	
	
}
