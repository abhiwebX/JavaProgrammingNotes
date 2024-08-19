/**
 * fact
 */
public class fact {

  public static void main(String[] args) {
    int a = 120;
    int b;
    while (a > 0) {
      b = a % 10;
      a = a / 10;

      System.out.print(b);
    }
  }
}