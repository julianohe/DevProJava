package Comportamentais.Command.imposto;

import Comportamentais.Command.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
