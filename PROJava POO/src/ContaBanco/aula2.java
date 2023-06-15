package ContaBanco;

import br.com.PROJavaPOO.ContaBanco.ContaBanco;

public class aula2 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Juliano");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Amanda");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);

        p1.sacar(100);
        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}
