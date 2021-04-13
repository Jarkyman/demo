public class TestFile {


  public static void main(String[] args) {
    String[] myArray = new String[4];
    myArray[0] = "Hej";
    myArray[1] = "med";
    myArray[2] = "dig";
    myArray[3] = "!";

    System.out.println(String.join(" ", myArray));

    for (String array : myArray) {
      System.out.print(array + " ");
    }
    System.out.println();

    int[] myIntArray = {1, 3, 5, 7, 9};

    for (int number : myIntArray) {
      System.out.print(number + " ");
    }
    System.out.println();

    printPlease(myIntArray);

  }

  public static void printPlease(int[] insert) {
    for (int number : insert) {
      System.out.print(number + " ");
    }
    System.out.println();
  }

}
