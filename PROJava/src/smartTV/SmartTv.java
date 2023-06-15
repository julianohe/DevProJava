package smartTV;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal( int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }


    public void aumentarVolume(){
        //volume = volume +1;
        volume++;
        System.out.println("Aumenta o Volume para: " + volume);
    }
    public void diminuirVolume(){
        //volume = volume -1;
        volume--;
        System.out.println("Diminuindo o Volume para: " + volume);

    }

    public void ligar(){
        ligada = true;
    }
    public void desligada(){
        ligada = false;
    }
}
