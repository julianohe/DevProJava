package Decorators.pedido.acoes;

import Decorators.pedido.Pedido;

public class EnviarPedidoPorEmail implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando email para cliente sobre pedido...");
    }
}
