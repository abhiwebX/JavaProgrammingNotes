public class Palindrom {
  public static void main(String[] args) {
    int rev = 0;
    int num = 010;
    int OriNum = num;
    boolean flag = false;

    while (num > 0) {
      for (int i = 1; i <= num; i++) {
        rev = rev * 10 + num % 10;
        num = num / 10;
      }

    }
    if (OriNum == rev) {

      System.out.println("The Number is Palindrome");
    } else {

      System.out.println("The Number is not Palindrome");
    }
  }
}
