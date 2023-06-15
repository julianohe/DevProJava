package Pessoa.ProgetoPessoa1;


public class Aula11 {
    public static void main(String[] args) {
        /*Pessoa p1 = new Pessao();
         * Visitante v1 = new Visitante();
         * v1.setNome("joão");
         * v1.setIdade(18);
         * v1.setSexo("M");
         *System.out.println(v1.toString());
         */
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informartica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(2222);
        b1.setNome("Julia");
        b1.setBolsa(12.5f);
        b1.setSexo("F");
        b1.pagarMensalidade();
    }

    
}
