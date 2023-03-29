public class Personagem{
  String nome;
  int energia = 10;
  int fome = 0;
  int sono = 0;

  //4 partes:
  //tipo de retorno
  //nome
  //lista de parâmetros
  //corpo
  void cacar(){
    if(energia >= 2){
      System.out.printf("%s esta cacando...%n", nome);  
      energia = energia - 2; // energia -= 2;  
    }
    else{
      System.out.printf("%s sem energia para cacar...%n", nome);
    }
    fome = Math.min(fome + 1, 10);
    sono = Math.min(sono + 1, 10);
  }

  void comer(){
    if(fome >= 1){      
      System.out.println(nome + " esta comendo...");
      energia = Math.min(energia + 1, 10);
      fome -= 1; // fome = fome - 1;
    }
    else{
      System.out.printf("%s sem fome...%n", nome);
    }
  }

  void dormir(){
    if(sono >= 1){
      System.out.print(nome + " esta dormindo...\n");
      sono--; //--sono;
      energia = energia + 1 <= 10 ? energia + 1: 10;
    }
    else{
      System.out.printf("%s sem sono...%n", nome);
    }
  }

  double calcularRaiz2(double n){
    double resultado = Math.sqrt(n);
    return resultado;
  }

  String obterEstado(){
    String estado = String.format(
      "energia: %d, fome: %d, sono: %d, nome: %s",
      energia, fome, sono, nome
    );
    return estado;  
  }
}