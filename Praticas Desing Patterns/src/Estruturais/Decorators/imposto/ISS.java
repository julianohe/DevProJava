package Estruturais.Decorators.imposto;

import Estruturais.Decorators.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto {
    public ISS(Imposto outro) {
        super(outro);
    }

    public BigDecimal realizarCalculoEspecifico(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
