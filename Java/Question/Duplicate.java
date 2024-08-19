import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;
/**
 * Duplicate
 */
public class Duplicate {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Index of array");
    int index = sc.nextInt();
    int[] a = new int[index];
    HashSet<Integer> sh = new HashSet<Integer>();
    System.out.println("Enter the Elements of array :");
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();

      sh.add(a[i]);
    }

    for (int e : sh) {
      System.out.print(e + " ");
    }

  }

}