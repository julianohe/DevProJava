package Estruturais.Proxy;

import Estruturais.Composite.orcamento.ItemOrcamento;
import Estruturais.Composite.orcamento.Orcamento;
import Estruturais.Proxy.orcamento.OrcamentoProxy;

import java.math.BigDecimal;

public class TestesComposite {
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        Orcamento novo = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        novo.adicionarItem(antigo);

        OrcamentoProxy proxy = new OrcamentoProxy(novo);

        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
    }

}
