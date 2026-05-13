package Entidade;
import java.time.LocalDate;

public class Evento {

	private Local local;
	private LocalDate data;
	private TipoEvento tipoEvento;
	
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
	
}
