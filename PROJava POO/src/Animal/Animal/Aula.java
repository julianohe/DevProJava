package Animal.Animal;

public class Aula {

    public static void main(String[] args) throws Exception {
        Manifero m = new Manifero();
        Reptil r =new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfirst g = new Goldfirst();
        Arara e = new Arara();


        c.locomover();
        c.emitirSom();
        k.locomover();
        k.emitirSom();
    }
}
