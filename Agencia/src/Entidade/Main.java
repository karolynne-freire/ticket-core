package Entidade;
import java.time.LocalDate;

public class Main {
	    public static void main(String[] args) {
	        GestaoEventos gestao = new GestaoEventos();

	        Local l1 = new Local("Classic Hall", "Av. Agamenon", Estrutura.COBERTO, 5000);
	        gestao.cadastrarLocal(l1);
	        Local l2 = new Local("Classic Hall", "Av. feliz", Estrutura.AR_LIVRE, 4000);
	        gestao.cadastrarLocal(l2);
	        
	        Evento e1 = new Evento(l1, LocalDate.now(), TipoEvento.SHOWS, "Show de Verão");
	        gestao.cadastrarEvento(e1);
	        Evento e2 = new Evento(null, LocalDate.now(), TipoEvento.SHOWS, "Show de Verão");
	        gestao.cadastrarEvento(e2);

	        Ingresso i1 = new Ingresso(100.0, 1, TipoIngresso.INTEIRA, true, e1, 100.0, true);
	        gestao.registrarIngresso(i1);
	        Ingresso i2= new Ingresso(100.0, 1, TipoIngresso.INTEIRA, true, null, 100.0, true);
	        gestao.registrarIngresso(i2);
	        Ingresso i3 = new Ingresso(100.0, 2, TipoIngresso.INTEIRA, true, e1, 100.0, true);
	        gestao.registrarIngresso(i3);
            
	        
	        System.out.println("Receita: R$" + gestao.calcularReceita(e1));
	        System.out.println("Lotação máxima atingida? " + gestao.verificarLotacao(e1));
	        System.out.println("Total de público no evento: " + gestao.contarPublico(e1));
	    }
	}
