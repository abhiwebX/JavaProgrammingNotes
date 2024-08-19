class main {

  //// write a program to find the sum of the array;;
  static void sum() {
    int[] a = { 1, 2, 3, 4, 3, 4, 3, 2 };
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum = sum + a[i];
    }
    System.out.println(sum);
  }

  ///// Write a program to find the maximum value from the array
  static void max() {
    int[] max = { 1, 2, 43, 2, 1, 56 };
    int sum = 0;
    for (int i = 0; i < max.length; i++) {
      if (max[i] > sum) {
        sum = max[i];
      }
    }
    System.out.println(sum);
  }

  //// searching for the element is the array and returning its index if the array
  //// element is not available return -1 value;
  static void search() {
    int num = 9;
    int[] arr = { 1, 2, 3, 6, 5, 4 };
    int ans = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == num) {
        ans = i;
      }
    }
    if (ans != -1) {

      System.out.println("Number is Present is " + ans + " index");
    } else {
      System.out.println("Element not Found is Array :" + ans);
    }
  }

  /// write a program to print multidimention array
  static void multi() {
    // int [][] arr = new int[2][1];

    // 0 21
    // 0 11
    // 0 54
    // 1 1
    // 1 2
    // 1 22

    int[][][] arr = { { { 21, 11, 54 }, { 4, 8, 6 } }, { { 9, 9, 0 }, { 36, 87, 7 } } };

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        for (int k = 0; k < arr[i][j].length; k++) {

          System.out.println(i + " " + j + " " + arr[i][j][k]);

        }
      }
    }

  }

  public static void main(String[] args) {

  }
}
