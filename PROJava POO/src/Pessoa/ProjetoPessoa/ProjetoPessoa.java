package Pessoa.ProjetoPessoa;

import Pessoa.ProjetoPessoa.Pessoa;

public class ProjetoPessoa {
    public static void main(String[] args) throws Exception {
        var p1 = new Pessoa();
        Pessoa.ProjetoPessoa.Aluno p2 = new Aluno();
        Pessoa.ProjetoPessoa.Professor p3 = new Professor();
        Pessoa.ProjetoPessoa.Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Ana");
        p3.setNome("Alice");
        p4.setNome("José");

        p1.setSexo("M");
        p3.setSexo("F");
        p2.setIdade(18);

        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");



        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());


    }
}
