public class Ex4 {

  public static void main(String[] args) {

    int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};


    System.out.println(search(numbers, 20));

    System.out.println(search(numbers, 99));

  }

  public static boolean search(int[] array, int searching) {
    for (int i : array) {
      if (searching == i) {
        return true;
      }
    }
    return false;
  }

}

/*
Write a Java program to test if an
array contains a specific value.
 */
