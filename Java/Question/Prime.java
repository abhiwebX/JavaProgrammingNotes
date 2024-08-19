import java.util.Scanner;

/**
 * Prime
 */
public class Prime {

  public static void main(String[] args) {
    try (Scanner sch = new Scanner(System.in)) {
      System.out.println("Enter the Number : ");
      int num = sch.nextInt();
      int count = 0;

      if (num > 1) {
        for (int i = 1; i <= num; i++) {

          if (num % i == 0) {
            count++;
          }

        }
        if (count == 2) {
          System.out.println("The Number " + num + "is prime number");
        } else {

          System.out.println("The Number " + num + "is not  prime number");
        }
      }
    }
  }
}