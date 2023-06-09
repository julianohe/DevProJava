package Comportamentais.ChainofResponsibility.desconto;

import Comportamentais.Strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoOrcamentoItens(
                new DescontoOrcamentoDoValor(
                        new SemDesconto()
                ));
        return desconto.calcular(orcamento);
    }
}
