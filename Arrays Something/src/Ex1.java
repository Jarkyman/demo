import java.util.Arrays;

public class Ex1 {

  public static void main(String[] args) {

    int[] numbers = {2, 95, 65, 84, 9, 23, 75, 18, 54, 45, 29, 84};
    Arrays.sort(numbers);
    for (int number : numbers) {
      System.out.print(number + ", ");
    }
    System.out.println();

    String[] texts = {"Hej", "Goddag", "Welcome", "Mer tak", "Uha da da", "God jul"};

    Arrays.sort(texts);
    for (String text : texts) {
      System.out.print(text + ", ");
    }
    System.out.println();


  }

}

/*
Write a Java program to sort a
numeric array and a string array.
 */
