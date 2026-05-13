package Entidade;

import java.util.ArrayList;

public class GestaoEventos {
    private ArrayList<Evento> eventos = new ArrayList<>();
    private ArrayList<Local> locais = new ArrayList<>();
    private ArrayList<Ingresso> ingressos = new ArrayList<>();


    public void cadastrarLocal(Local novoLocal) {
        for (Local l : locais) {
            if (l.getNome().equalsIgnoreCase(novoLocal.getNome())) {
                System.out.println("Erro: Já existe um local com este nome.");
                return;
            }
        }
        locais.add(novoLocal);
        System.out.println("Cadastro realizado com sucesso");
    }

    public void cadastrarEvento(Evento novoEvento) {
        if (novoEvento.getLocal() == null) {
            System.out.println("Erro: O evento deve obrigatoriamente estar associado a um local.");
            return;
        }
        eventos.add(novoEvento);
        System.out.println("Cadastro realizado com sucesso");
    }

    public void registrarIngresso(Ingresso novoIngresso) {
        if (novoIngresso.getEvento() == null) {
            System.out.println("Erro: O ingresso deve ter obrigatoriamente um evento associado.");
            return;
        }
        ingressos.add(novoIngresso);
        System.out.println("Cadastro realizado com sucesso");
    }

    public double calcularReceita(Evento evento) {
        double total = 0;
        for (Ingresso i : ingressos) {
            if (i.getEvento().equals(evento) && i.isPagamentoRealizado()) {
                total += i.getValorPago();
            }
        }
        return total;
    }

    public int contarPublico(Evento evento) {
        int contagem = 0;
        for (Ingresso i : ingressos) {
            if (i.getEvento().equals(evento) && i.isPagamentoRealizado()) {
                contagem++;
            }
        }
        return contagem;
    }

    public boolean verificarLotacao(Evento evento) {
        int vendidos = contarPublico(evento);
        return vendidos >= evento.getLocal().getCapacidadeMaxima();
    }
    
}