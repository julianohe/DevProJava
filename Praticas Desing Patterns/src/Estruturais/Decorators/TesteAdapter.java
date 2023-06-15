package Estruturais.Decorators;

import Estruturais.Decorators.http.ApacheHttpAdapter;
import Estruturais.Decorators.orcamento.Orcamento;
import Estruturais.Decorators.orcamento.ResgistroOrcamento;

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
