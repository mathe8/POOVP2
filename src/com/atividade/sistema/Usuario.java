package com.atividade.sistema;

import com.atividade.sistema.financeiro.Investimento;
import com.atividade.sistema.financeiro.fundos.TesouroSELIC;
import com.atividade.sistema.financeiro.fundos.CDB;
import com.atividade.sistema.financeiro.fundos.LCI;

public class Usuario {

    private final String nome;
    private Investimento[] investimentos;
    private Integer contInv;

    public Usuario(String nome) {
        this.nome = nome;
        this.investimentos = new Investimento[99];
        this.contInv = 0;
    }

    public void adicionarInvestimento(Integer tipo, String intistuicaoFinaceira, Double valorAplicado, Double taxaDeRendimentoAoMes) {
        if (tipo == 1) {
            this.investimentos[this.contInv] = new TesouroSELIC(intistuicaoFinaceira, valorAplicado, taxaDeRendimentoAoMes);
        }else if (tipo == 2) {
            this.investimentos[this.contInv] = new CDB(intistuicaoFinaceira, valorAplicado, taxaDeRendimentoAoMes);
        }else {
            this.investimentos[this.contInv] = new LCI(intistuicaoFinaceira, valorAplicado, taxaDeRendimentoAoMes);
        }
        this.contInv++;
    }

    public Investimento selecionarInvestimento(Integer numInvestimento){
        return this.investimentos[numInvestimento-1];
    }

}
