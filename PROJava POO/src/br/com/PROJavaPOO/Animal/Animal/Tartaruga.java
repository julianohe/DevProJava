package br.com.PROJavaPOO.Animal.Animal;

public class Tartaruga extends Reptil {
    @Override
    public void locomover() {
        System.out.println("Anda!Anda");
    }
    @Override
    public void emitirSom() {
        System.out.println("Não transmiti Som");
    }
}
