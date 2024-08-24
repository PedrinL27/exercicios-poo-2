public class TestarInterruptor {
  public static void main(String[] args) {
    Lampada lampada = new Lampada();

    lampada.pressionar();
    lampada.verificarLampada();

    lampada.pressionar();
    lampada.verificarLampada();
  }
}
