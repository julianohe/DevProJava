package Estruturais.AdapterApi;

import Estruturais.AdapterApi.http.ApacheHttpAdapter;
import Estruturais.AdapterApi.orcamento.Orcamento;
import Estruturais.AdapterApi.orcamento.ResgistroOrcamento;

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
