public class ArrayOps {

  public static int sum(int[] arr) {
    int sum = 0;
    int i = 0;
    while (i < arr.length) {
      sum = sum + arr[i];
      i = i + 1;
    }
    return sum;
  }
}
