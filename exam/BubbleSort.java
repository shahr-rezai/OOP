package exam;

public class BubbleSort {
  public static void main(String[] args) {
    int[] array = {12, 4, 7, 9, 1, 5};
    int temp;

    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }

    System.out.println("Sorted array:");
    for (int num : array) {
      System.out.print(num + " ");
    }
  }
}
