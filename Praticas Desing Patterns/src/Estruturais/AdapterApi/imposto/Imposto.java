package Estruturais.AdapterApi.imposto;

import Estruturais.AdapterApi.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
