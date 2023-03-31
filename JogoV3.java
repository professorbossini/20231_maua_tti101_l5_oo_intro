import java.util.Random;
public class JogoV3 {
  public static void main(String[] args) throws Exception {
    //0: cacar
    //1: comer
    //2: dormir
    Random gerador = new Random();
    var cacador = new Personagem();
    // cacador.energia = 1000;
    // cacador.fome = 50;
    cacador.nome = "Marlon";
    while (true){
      //sortear um valor entre 0 e 2
      int oQueFazer = gerador.nextInt(3);
      //usar um switch/case para decidir o que o Marlon vai fazer
      switch(oQueFazer){
        case 0:
            cacador.cacar();
          break;
        case 1:
            cacador.comer();
          break;
        case 2:
            cacador.dormir();
          break;
      }
      System.out.println(cacador.obterEstado());
      Thread.sleep(10000);
    }
  }
}
