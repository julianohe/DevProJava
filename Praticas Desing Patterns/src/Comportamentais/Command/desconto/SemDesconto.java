package Comportamentais.Command.desconto;

import Comportamentais.Command.orcamento.Orcamento;

import java.math.BigDecimal;

public  class SemDesconto extends Desconto {
    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return true;
    }


}
