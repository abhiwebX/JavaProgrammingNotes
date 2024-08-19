import java.util.Scanner;

public class Bank {
  public static void main(String[] args) {
    Account a = new Account(5000);
    Customer c = new Customer(a, "Abhijeet");
    Customer cc = new Customer(a, "Abhishek");
    Thread t = new Thread(c);
    Thread tt = new Thread(cc);
    t.start();
    tt.start();

  }
}

class Account {
  int bal;

  Account(int b) {
    bal = b;
  }

  public boolean isSufff(int amt) {
    if (bal > amt) {
      return true;
    } else {
      return false;
    }
  }

  public void withdraw(int amt) {
    bal = bal - amt;
    System.out.println("withdraw Succcess :" + amt);
    System.out.println("Current balance is :" + bal);
  }

}

class Customer implements Runnable {
  Account Cbal;
  String name;

  Customer(Account c, String n) {
    name = n;
    Cbal = c;

  }

  public void run() {
    synchronized (Cbal) {

      Scanner s = new Scanner(System.in);
      System.out.print(name + " Enter Amount : ");
      int amt = s.nextInt();

      if (Cbal.isSufff(amt)) {
        Cbal.withdraw(amt);
      } else {
        System.out.println("Server Problem try few minues later");
      }

    }

  }
}