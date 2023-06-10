package AdapterApi.pedido.acoes;

import AdapterApi.pedido.Pedido;

public class CriarPedidoNoBanco implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados...");
    }
}
