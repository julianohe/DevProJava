package Estruturais.Decorators;

import Estruturais.Decorators.imposto.ICMS;
import Estruturais.Decorators.imposto.ISS;
import Estruturais.Decorators.imposto.Imposto;
import Estruturais.Decorators.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);

        Imposto imposto = new ICMS(new ISS(null));
        System.out.println(imposto.calcular(orcamento));
    }
}
