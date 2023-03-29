public class JogoV2 {
  public static void main(String[] args) throws Exception{
    //construir um personagem
    Personagem p = new Personagem();
    //dar um nome para ele
    p.nome = "Wellington";
    //escrever um loop infinito usando um for
    for ( ; ; ){
      //a cada iteração, fazer o personagem comer, dormir e cacar, nesta ordem
      p.comer();
      p.dormir();
      p.cacar();
      System.out.println("******************************");
      Thread.sleep(5000);
    }

  }
}
