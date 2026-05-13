package Entidade;
import java.time.LocalDate;

public class Evento {

	private Local local;
	private LocalDate data;
	private TipoEvento tipoEvento;
	private String nome;	
	
	
	public Evento() {
		super();
    }
	
	
	public Evento(Local local, LocalDate data, TipoEvento tipoEvento, String nome) {
		super();
		this.local = local;
		this.data = data;
		this.tipoEvento = tipoEvento;
		this.nome = nome;
	}


	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}
	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
