package ProjetoYoutube;

import ProjetoYoutube.Pessoa;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistindo;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistindo = 0;
    }

    @Override
    public String toString() {
        return "Gafanhoto {" + super.toString() + "\nlogin=" + login + ", totAssistindo=" + totAssistindo + "}";
    }

}
