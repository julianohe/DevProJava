package Estruturais.Facade.desconto;

import Estruturais.Facade.orcamento.Orcamento;

import java.math.BigDecimal;

public  class DescontoOrcamentoItens extends Desconto {
    public DescontoOrcamentoItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }


}
