package Estruturais.Composite.orcamento.situacao;

import Estruturais.Composite.DomainException;
import Estruturais.Composite.orcamento.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        throw new DomainException("Orcamento reprovado nao pode ter desconto extra!");
    }

    @Override
    public void finalizar(Orcamento orcamento) throws DomainException {
        orcamento.setSituacao(new Finalizado());
    }
}
