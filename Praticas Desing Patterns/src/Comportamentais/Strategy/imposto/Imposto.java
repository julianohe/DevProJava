package Comportamentais.Strategy.imposto;

import Comportamentais.Strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
