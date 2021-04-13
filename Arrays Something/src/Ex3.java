public class Ex3 {

  public static void main(String[] args) {

    int[] array = {1, 3, 5, 7, 9};
    int sum = 0;
    int average = 0;

    for (int j : array) {
      sum += j;

    }

    System.out.println(sum);

    average = sum / array.length;
    System.out.println(average);

  }

}

/*
Write a Java program to sum values of an array.
Write a Java program to calculate the average value of array elements.
 */
