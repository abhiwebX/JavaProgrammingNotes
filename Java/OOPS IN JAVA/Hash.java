import java.util.*;

public class Hash {
  public static void main(String[] args) {
    List<String> t = new ArrayList<>(5);
    t.add("A");
    t.add("B");
    t.add("A");
    t.add("W");
    t.add("T");

    List<String> Db = new ArrayList<String>(new LinkedHashSet<String>(t));

    System.out.println(Db);
  }

}
