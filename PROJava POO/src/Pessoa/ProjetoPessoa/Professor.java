package Pessoa.ProjetoPessoa;

import Pessoa.ProjetoPessoa.Pessoa;

public class Professor extends Pessoa.ProjetoPessoa.Pessoa {
    private String especialista;
    private float salario;

    public void ReceberAum (float aum) {
        this.salario += aum;    
    }

    public String getEspecialista() {
        return especialista;
    }

    public void setEspecialista(String especialista) {
        this.especialista = especialista;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
