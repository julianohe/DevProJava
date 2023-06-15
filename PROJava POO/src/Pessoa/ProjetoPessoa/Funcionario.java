package Pessoa.ProjetoPessoa;

import br.com.PROJavaPOO.Pessoa.ProjetoPessoa.Pessoa;

public class Funcionario extends Pessoa.ProjetoPessoa.Pessoa.ProjetoPessoa.Pessoa {
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho (){
        this.trabalhando = ! this.trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
