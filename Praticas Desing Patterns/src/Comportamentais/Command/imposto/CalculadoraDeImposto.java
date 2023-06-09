package Comportamentais.Command.imposto;

import Comportamentais.Command.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImposto {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){

        return imposto.calcular(orcamento);
    }
}
