package Comportamentais.Observer.imposto;

import Comportamentais.Observer.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
