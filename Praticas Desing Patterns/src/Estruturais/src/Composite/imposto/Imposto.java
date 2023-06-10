package Composite.imposto;

import Composite.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
