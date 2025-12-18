package br.newtonpaiva.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Ticket {
    private final LocalDateTime inicio;
    private LocalDateTime fim;
    private final Veiculo veiculo;

    public Ticket(LocalDateTime inicio, Veiculo veiculo) {
        this.inicio = inicio;
        this.veiculo = veiculo;
    }

    /**
     * Fecha o ticket e aplica a estratégia de cálculo informada.
     * Observação: nesta versão, a estratégia usa parâmetros próprios
     * (por ex.: horas no construtor), não derivadas do período do ticket.
     */
    public BigDecimal fechar(Calcular calcular) {
        this.fim = LocalDateTime.now();
        return calcular.execute();
    }

    public LocalDateTime getInicio() { return inicio; }
    public LocalDateTime getFim() { return fim; }
    public Veiculo getVeiculo() { return veiculo; }
    public void setFim(LocalDateTime fim) { this.fim = fim; }
}
