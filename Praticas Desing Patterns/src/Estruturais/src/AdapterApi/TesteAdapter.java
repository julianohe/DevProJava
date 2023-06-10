package AdapterApi;

import AdapterApi.http.ApacheHttpAdapter;
import AdapterApi.orcamento.Orcamento;
import AdapterApi.orcamento.ResgistroOrcamento;

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
