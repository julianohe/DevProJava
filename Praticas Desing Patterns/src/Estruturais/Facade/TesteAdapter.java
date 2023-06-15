package Estruturais.Facade;

import Estruturais.Facade.http.ApacheHttpAdapter;
import Estruturais.Facade.orcamento.Orcamento;
import Estruturais.Facade.orcamento.ResgistroOrcamento;

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
