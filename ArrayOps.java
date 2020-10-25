public class ArrayOps {

  public static int sum(int[] arr) {
    int sum = 0;
    int i = 0;
    if (arr.length == 0) {
      return sum;
    }
    else {
      while (i < arr.length) {
        sum = sum + arr[i];
        i = i + 1;
      }
      return sum;
    }
  }

  public static int largest(int[] arr) {
    int big = -100;
    int i = 0;
    while (i < arr.length) {
      if (arr[i] > big) {
        big = arr[i];
      }
      i = i + 1;
    }
    return big;
  }
}
