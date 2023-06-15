package Estruturais.AdapterApi.orcamento.situacao;

import Estruturais.AdapterApi.DomainException;
import Estruturais.AdapterApi.orcamento.Orcamento;

import java.math.BigDecimal;

public class Finalizado extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
    }
}
