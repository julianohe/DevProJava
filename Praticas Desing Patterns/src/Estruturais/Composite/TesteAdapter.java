package Estruturais.Composite;

import Estruturais.Composite.http.ApacheHttpAdapter;
import Estruturais.Composite.orcamento.Orcamento;
import Estruturais.Composite.orcamento.ResgistroOrcamento;

import java.math.BigDecimal;

public class TesteAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        ResgistroOrcamento registro = new ResgistroOrcamento(new ApacheHttpAdapter());
        registro.resgistrar(orcamento);
    }
}
