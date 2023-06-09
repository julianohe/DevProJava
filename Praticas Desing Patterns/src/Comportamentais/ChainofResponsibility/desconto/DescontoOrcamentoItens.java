package Comportamentais.ChainofResponsibility.desconto;

import Comportamentais.ChainofResponsibility.orcamento.Orcamento;

import java.math.BigDecimal;

public  class DescontoOrcamentoItens extends Desconto {
    public DescontoOrcamentoItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }





}
