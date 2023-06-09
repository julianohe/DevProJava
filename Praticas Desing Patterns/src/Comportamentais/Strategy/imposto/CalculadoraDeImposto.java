package Comportamentais.Strategy.imposto;

import Comportamentais.Strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImposto {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
      return imposto.calcular(orcamento);
    }
}
