package Comportamentais.ChainofResponsibility.desconto;

import Comportamentais.ChainofResponsibility.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoDoValor extends Desconto {
    public DescontoOrcamentoDoValor(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }
        return proximo.calcular(orcamento);
    }




}
