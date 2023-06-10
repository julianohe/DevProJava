package Facade.desconto;

import Facade.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoDoValor extends Desconto {
    public DescontoOrcamentoDoValor(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }


}
