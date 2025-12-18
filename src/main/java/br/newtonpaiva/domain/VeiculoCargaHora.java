package br.newtonpaiva.domain;

import java.math.BigDecimal;

public class VeiculoCargaHora implements Calcular {
    private final Long horas;
    private final Integer eixos;
    private final BigDecimal valorHora;

    public VeiculoCargaHora(Long horas, Integer eixos, BigDecimal valorHora) {
        this.horas = horas;
        this.eixos = eixos;
        this.valorHora = valorHora;
    }

    @Override
    public BigDecimal execute() {
        BigDecimal h = BigDecimal.valueOf(horas);
        BigDecimal e = BigDecimal.valueOf(eixos);
        return valorHora.multiply(h).multiply(e); // R$ * horas * eixos
    }
}