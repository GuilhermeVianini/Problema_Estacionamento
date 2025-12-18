package br.newtonpaiva.ui;

import br.newtonpaiva.domain.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TelaEstacionamento {
    public static void main(String[] args) {
        // Veículo e abertura de ticket
        Veiculo veiculo = new Veiculo("GNV7752");
        LocalDateTime inicio = LocalDateTime.now();
        Ticket ticket = new Ticket(inicio, veiculo);

        // Estratégia: caminhão por hora (ex.: 7h, 8 eixos, R$10/hora)
        Calcular calc = new VeiculoCargaHora(7L, 8, BigDecimal.TEN);
        BigDecimal valor = ticket.fechar(calc);

            System.out.println("Ticket fechado para " + veiculo + " → Valor: R$ " + valor);
    }
}