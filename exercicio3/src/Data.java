public class Data {
  private int dia;
  private int mes;
  private int ano;
  
  void escreverData() {
    System.out.printf("%02d/%02d/%04d\n", dia, mes, ano);
  }

  void escreverMes() {
    String[] meses = {
        "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };

    System.out.println("Mes: " + meses[mes-1]);
  }

  public void setDia(int dia) {
    this.dia = dia;
  }
  public void setMes(int mes) {
    this.mes = mes;
  }
  public void setAno(int ano) {
    this.ano = ano;
  }
}
