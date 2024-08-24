public class Lampada {
  private boolean ligado;

  void pressionar() {
    if (ligado) ligado = false;
    else ligado = true;
  }

  void verificarLampada() {
    if (ligado) System.out.println("Lampada esta acesa");
    else System.out.println("Lampada esta desligada");
  }
}
