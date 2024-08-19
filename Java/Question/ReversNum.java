public class ReversNum {
  public static void main(String[] args) {
    // String num = "123";
    // StringBuilder sb = new StringBuilder();
    // sb.append(num);
    // sb.reverse();
    // System.out.println(sb);
    // int number = 234;

    // StringBuffer sbb = new StringBuffer(String.valueOf(number));
    // sbb.reverse();
    // System.out.println(sbb);

    int rev = 0;
    int num = 12345;

    while (num != 0) {
      rev = rev * 10 + num % 10;
      num = num / 10;
    }
    System.out.println(rev);
  }
}
