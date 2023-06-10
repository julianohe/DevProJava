package Decorators.imposto;

import Decorators.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImposto {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.realizarCalculoEspecifico(orcamento);
    }
}
