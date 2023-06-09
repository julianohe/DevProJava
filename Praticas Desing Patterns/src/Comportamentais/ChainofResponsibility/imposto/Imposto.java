package Comportamentais.ChainofResponsibility.imposto;

import Comportamentais.ChainofResponsibility.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
