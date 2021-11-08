package com.atividade.sistema.financeiro.fundos;

import com.atividade.sistema.financeiro.Investimento;

public class CDB extends Investimento {

    private static final Double impostoFixo = 0.15;

    public CDB(String intistuicaoFinaceira, Double valorAplicado, Double taxaDeRendimentoAoMes) {
        super(intistuicaoFinaceira, valorAplicado, taxaDeRendimentoAoMes, impostoFixo);
    }

    public Double calcularRendimento() {
        Double montante = 1.005 * (super.getValorAplicado() * Math.pow((1.005+super.getTaxaDeRendimentoAoMes()), 12));
        return montante - (montante * (super.getPercentualDeImpostoSobreLucro() / 100));
    }

}
