public class TestarData {
  public static void main(String[] args) {
    Data data = new Data();

    data.setDia(2);
    data.setMes(9);
    data.setAno(2024);

    data.escreverData();
    data.escreverMes();

    data.setMes(4);

    data.escreverData();
    data.escreverMes();
  }
}
