package Estruturais.Proxy.desconto;

import Estruturais.Proxy.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento){
        Desconto cadeiaDeDesconto = new DescontoOrcamentoItens(
                new DescontoOrcamentoDoValor(
                        new SemDesconto()
                ));
        return cadeiaDeDesconto.calcular(orcamento);
    }
}
