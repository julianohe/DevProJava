package Comportamentais;

import Comportamentais.Command.pedido.GeraPedido;
import Comportamentais.Command.pedido.GeraPedidoHandler;

import java.math.BigDecimal;

public class TestesPeedidos {
    public static void main(String[] args) {
        String cliente = "Ana da Silva";
        BigDecimal valorOrcamento = new BigDecimal("745.99");
        int quantidadeItens = 3;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler();
        handler.executar(gerador);
    }
}
