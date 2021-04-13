public class Ex2 {

  public static void main(String[] args) {


    int array[] = {49, 1, 3, 200, 2, 4, 70, 5};

    int consecutive = 0;

    System.out.println(array.length - 1);

    for (int i = 0; i < array.length; i++) {
      if (array.length - 1 == i) {
        System.out.println(array[i] + ". ");
      } else {
        System.out.print(array[i] + ", ");
      }
    }


    for (int j = 0; j < array.length; j++) {
      if (array[array.length - j] == array[j]) {
        consecutive++;
      } else if (array[array.length + 1] == array[j]) {
        consecutive--;
      }

      System.out.println(consecutive);

    }



/*
      for (int i = 0; i < array.length; i++) {
        arrayCount++;
        if ( array[i] + array[i - 1] == 1 ){
          consecutive++;
        } else if (array[i] - 1 == array[i + 1]) {
          consecutive++;
        }

      }

    */

    //System.out.println(consecutive);

  }


}

/*
Write a Java program to find the length of the longest
consecutive elements sequence from a given unsorted array of integers.
Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
The longest consecutive elements sequence is [1, 2, 3, 4, 5],
therefore the program will return its length 5.
 */
