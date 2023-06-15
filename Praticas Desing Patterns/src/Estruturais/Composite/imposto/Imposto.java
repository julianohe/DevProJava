package Estruturais.Composite.imposto;

import Estruturais.Composite.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
