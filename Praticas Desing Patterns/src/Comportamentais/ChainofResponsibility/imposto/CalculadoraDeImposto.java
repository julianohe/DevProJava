package Comportamentais.ChainofResponsibility.imposto;

import Comportamentais.ChainofResponsibility.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImposto {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
      return imposto.calcular(orcamento);
    }
}
