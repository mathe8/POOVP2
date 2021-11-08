package com.atividade.sistema.financeiro.fundos;

import com.atividade.sistema.financeiro.Investimento;

public class TesouroSELIC extends Investimento {

    private static final Double impostoFixo = 0.15;

    public TesouroSELIC(String intistuicaoFinaceira, Double valorAplicado, Double taxaDeRendimentoAoMes){
        super(intistuicaoFinaceira, valorAplicado, taxaDeRendimentoAoMes, impostoFixo);
    }

    public Double calcularRendimento() {
        Double montante = 1.005 * (super.getValorAplicado() * Math.pow((super.getTaxaDeRendimentoAoMes()), 12));
        return montante - (montante * (super.getPercentualDeImpostoSobreLucro() / 100));
    }

}
