public class Multi {
  public static void main(String[] args) {
    P1 a = new P1();
    a.start();
    P2 aa = new P2();
    aa.start();
    P3 aaa = new P3();
    aaa.start();
    P4 aaaa = new P4();
    aaaa.start();
  }
}

class P1 extends Thread{
  public void run(){
    System.out.println("hello World P1");
  }

}
class P2 extends Thread{
  public void run(){
    System.out.println("hello World P2");
  }

}class P3 extends Thread{
  public void run(){
    System.out.println("hello World P3");
  }

}class P4 extends Thread{
  public void run(){
    System.out.println("hello World P4");
  }

}












