
public class Arcondicionado {

    // Atributos ou Características do Arcondicionado
      boolean ligado = false;
      int temperatura = 20;
       
     
     // Liga o Arcondicionado
    public void ligar() {
        ligado = true;
    }
    // Desliga o arcondicionado
    public void desligar() {
        ligado = false;
    }

    public void quente() {
        System.out.println("Ar ligado no quente");
    }

    public void frio() {
        System.out.println("Ar liagdo no frio");
    }

}