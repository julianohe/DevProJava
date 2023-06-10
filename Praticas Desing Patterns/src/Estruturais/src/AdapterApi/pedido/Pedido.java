package AdapterApi.pedido;

import AdapterApi.orcamento.Orcamento;

import java.time.LocalDateTime;

public class Pedido {
    private String cliente;
    private LocalDateTime data;
    private Orcamento orcamento;

    public Pedido(String cliente, LocalDateTime data, Orcamento orcamento) {
        this.cliente = cliente;
        this.data = data;
        this.orcamento = orcamento;
    }

    public String getCliente() {
        return cliente;
    }
}
