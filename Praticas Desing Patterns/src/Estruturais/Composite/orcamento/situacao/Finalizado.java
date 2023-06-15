package Estruturais.Composite.orcamento.situacao;

import Estruturais.Composite.DomainException;
import Estruturais.Composite.orcamento.Orcamento;

import java.math.BigDecimal;

public class Finalizado extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
    }
}
