package Estruturais.Decorators.orcamento.situacao;

import Estruturais.Decorators.DomainException;
import Estruturais.Decorators.orcamento.Orcamento;

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
