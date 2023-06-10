package Proxy.orcamento;

import java.math.BigDecimal;

public class OrcamentoProxy  extends Orcamento {

    private BigDecimal valor;
    private Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public OrcamentoProxy(Composite.orcamento.Orcamento novo) {
    }

    public BigDecimal getValor() {
        if (this.valor == null) {
            this.valor = orcamento.getValor();
        }
        return this.valor;
    }

}
