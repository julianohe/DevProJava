package Estruturais.Facade.imposto;

import Estruturais.Facade.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
