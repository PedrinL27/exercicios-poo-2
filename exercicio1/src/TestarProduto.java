public class TestarProduto {
 public static void main(String[] args) {
    Produto notebook = new Produto();

    notebook.setNome("Notebook");
    notebook.setPreco(2399);

    notebook.informarNome();
    notebook.informarPreco();

    notebook.fazerPromocao();

    notebook.informarPreco();
 }
}
