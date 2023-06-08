package br.com.PROJavaPOO.Pessoa.ProgetoPessoa1;

public class Aluno extends Pessoa1 {
    private int matricula;
    private String curso;

    public void pagarMensalidade () {
        System.out.println("Pagando Mensalidade do Aluno");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
