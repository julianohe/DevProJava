package Decorators;

import Decorators.imposto.ICMS;
import Decorators.imposto.ISS;
import Decorators.imposto.Imposto;
import Decorators.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);

        Imposto imposto = new ICMS(new ISS(null));
        System.out.println(imposto.calcular(orcamento));
    }
}
