package Proxy;

import Composite.orcamento.ItemOrcamento;
import Composite.orcamento.Orcamento;
import Proxy.orcamento.OrcamentoProxy;

import java.math.BigDecimal;

public class TestesComposite {
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        novo.adicionarItem(antigo);

        OrcamentoProxy proxy = new OrcamentoProxy(novo);

        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
    }

}
