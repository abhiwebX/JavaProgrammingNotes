import java.util.*;

public class collection {
  public static void main(String[] args) {
    ArrayList list = new ArrayList(5);
    list.add("A");
    list.add("A");
    list.add("B");
    list.add("B");
    list.add("B");
    list.add("C");
    list.add("L");
    list.add("I");

    Iterator g1 = list.iterator();
    while (g1.hasNext()) {
      String s1 = (String) g1.next();
      if (s1 != "B") {
        System.out.print(s1);
      }
    }

  }
}
