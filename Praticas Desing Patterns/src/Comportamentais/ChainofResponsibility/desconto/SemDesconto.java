package Comportamentais.ChainofResponsibility.desconto;

import Comportamentais.ChainofResponsibility.orcamento.Orcamento;

import java.math.BigDecimal;

public  class SemDesconto extends Desconto {
    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }





}
