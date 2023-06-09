package Comportamentais.TemplateMethod.imposto;

import Comportamentais.TemplateMethod.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
