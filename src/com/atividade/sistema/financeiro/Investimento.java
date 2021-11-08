package com.atividade.sistema.financeiro;

public abstract class Investimento {

    private final String intistuicaoFinaceira;
    private Double valorAplicado;
    private Double taxaDeRendimentoAoMes;
    private final Double percentualDeImpostoSobreLucro;

    public Investimento(String intistuicaoFinaceira, Double valorAplicado, Double taxaDeRendimentoAoMes, Double percentualDeImpostoSobreLucro) {
        this.intistuicaoFinaceira = intistuicaoFinaceira;
        this.valorAplicado = valorAplicado;
        this.taxaDeRendimentoAoMes = taxaDeRendimentoAoMes;
        this.percentualDeImpostoSobreLucro = percentualDeImpostoSobreLucro;
    }

    public abstract Double calcularRendimento();

    public Double calcularLucro() {
        return calcularRendimento() - this.valorAplicado;
    }

    public String getIntistuicaoFinaceira() {
        return intistuicaoFinaceira;
    }

    public Double getValorAplicado() {
        return valorAplicado;
    }

    public Double getTaxaDeRendimentoAoMes() {
        return taxaDeRendimentoAoMes;
    }

    public Double getPercentualDeImpostoSobreLucro() {
        return percentualDeImpostoSobreLucro;
    }

}
