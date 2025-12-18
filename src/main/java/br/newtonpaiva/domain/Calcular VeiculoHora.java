package br.newtonpaiva.domain;

import java.math.BigDecimal;

public class CalcularVeiculoHora implements Calcular {

    private final Long horas;
    private final BigDecimal valorHora;

    public CalcularVeiculoHora(Long horas, BigDecimal valorHora) {
        this.horas = horas;
        this.valorHora = valorHora;
    }

    @Override
    public BigDecimal execute() {
        return valorHora.multiply(Big        return valorHora.multiply(BigDecimal.valueOf(horas));
    }
