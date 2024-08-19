class A {
  private String name;

  public void setName(String Uname) {
    this.name = Uname;
  }

  public String getName() {
    return name;
  }
}

class B {
  public static void main(String args[]) {
    A aa = new A();
    aa.setName("Abhijeetdd");
    System.out.println(

        aa.getName());
  }
}