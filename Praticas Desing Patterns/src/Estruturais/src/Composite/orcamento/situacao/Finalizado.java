package Composite.orcamento.situacao;

import Composite.DomainException;
import Composite.orcamento.Orcamento;

import java.math.BigDecimal;

public class Finalizado extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
    }
}
