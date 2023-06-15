package Estruturais.Proxy.orcamento.situacao;

import Estruturais.Proxy.DomainException;
import Estruturais.Proxy.orcamento.Orcamento;

import java.math.BigDecimal;

public class Finalizado extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
    }
}
