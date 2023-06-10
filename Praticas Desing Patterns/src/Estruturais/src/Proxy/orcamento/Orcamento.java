package Proxy.orcamento;

import Proxy.DomainException;
import Proxy.orcamento.situacao.Aprovado;
import Proxy.orcamento.situacao.EmAnalise;
import Proxy.orcamento.situacao.Reprovado;
import Proxy.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }

    public Orcamento() {
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = this.situacao.calcularDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar() throws DomainException {
        this.situacao.aprovar(this);
    }

    public void reprovar() throws DomainException {
        this.situacao.reprovar(this);
    }

    public void finalizar() throws DomainException {
        this.situacao.finalizar(this);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(Aprovado situacao) {
        this.situacao = situacao;
    }

    public void setSituacao(Reprovado reprovado) {
    }

    public boolean isFinalizado() {
        return false;
    }
}
