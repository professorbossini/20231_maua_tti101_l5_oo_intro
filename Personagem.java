public class Personagem{
  String nome;
  int energia;
  int fome;
  int sono;

  //4 partes:
  //tipo de retorno
  //nome
  //lista de parâmetros
  //corpo
  void cacar(){
    System.out.printf("%s esta cacando...%n", nome);    
  }

  void comer(){
    System.out.println(nome + " esta comendo...");
  }

  void dormir(){
    System.out.print(nome + " esta dormindo...\n");
  }

  double calcularRaiz2(double n){
    double resultado = Math.sqrt(n);
    return resultado;
  }
}