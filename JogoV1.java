public class JogoV1 {
  public static void main(String[] args) {
    Personagem p = new Personagem();
    p.nome = "Cláudio";
    
    //estamos chamando o método cacar

    p.cacar();

    double raiz = p.calcularRaiz2(7);

    System.out.println(raiz);

    System.out.println("Game over");
  }
}

