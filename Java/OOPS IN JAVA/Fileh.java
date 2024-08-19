import java.io.*;

class Fileh {
  public static void main(String[] a) throws IOException {
    FileOutputStream cc = new FileOutputStream("A.txt", true);
    String ss = "Sh";
    char ac[] = ss.toCharArray();
    for (int i = 0; i < ac.length; i++) {
      cc.write(ac[i]);

    }
    cc.close();

    // f.createNewFile();
  }
}