package Estruturais.Composite.orcamento;

import Estruturais.Composite.DomainException;
import Estruturais.Composite.http.HttpAdapter;

import java.util.Map;

public class ResgistroOrcamento {
    private HttpAdapter httpAdapter;

    public ResgistroOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento) {
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orcamento nao finalizado nao pode ser registrado!");
        }

        String urlApi = "http://api.xyz/orcamento";
        Map<String, Object> dadosApi = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
        );

        httpAdapter.post(urlApi, dadosApi);
    }

    public void resgistrar(Orcamento orcamento) {
    }
}
