package Pessoa.ProjetoPessoa;

import Pessoa.ProjetoPessoa.Pessoa;

public class Aluno extends Pessoa.ProjetoPessoa.Pessoa{
    private int matricula;
    private String curso;

    public void cancelarMatricula () {
        System.out.println("Matricula será cancelada");
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
