public class Produto {
  private String nome;
  private double preco;

  void informarNome() {
    System.out.println("O nome do produto: " + nome);
  }

  void informarPreco() {
    System.out.printf("O preco do produto: R$%.2f\n", preco);
  }

  void fazerPromocao() {
    preco--;
  }


  void setNome(String nome) {
    this.nome = nome;
  }

  void setPreco(double preco) {
    this.preco = preco;
  }
}
