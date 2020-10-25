import java.util.Arrays;
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

  public static int[] sumRows(int[][] matrix) {
    int first = 0;
    int second = 0;
    int i = 0;
    while (i < matrix[0].length) {
      first = first + matrix[0][i];
      i = i + 1;
    }
    i = 0;
    while (i < matrix[1].length) {
      second = second + matrix[1][i];
      i = i + 1;
    }
    int[]arr = {first,second};
    return arr;
  }

  public static  int[] largestInRows(int[][] matrix) {
    int first = 0;
    int second = 0;
    int i = 0;
    while (i < matrix[0].length) {
      if (matrix[0][i] > first) {
        first = matrix[0][i];
      }
      i = i + 1;
    }
    i = 0;
    while (i < matrix[1].length) {
      if (matrix[1][i] > second) {
        second = matrix[1][i];
      }
      i = i + 1;
    }
    int[]arr = {first,second};
    return arr;
  }

  public static  int sum(int[][] arr) {
    int sum = 0;
    int i = 0;
    while (i < arr[0].length) {
      sum = sum + arr[0][i];
      i = i + 1;
    }
    i = 0;
    while (i < arr[1].length) {
      sum = sum + arr[1][i];
      i = i + 1;
    }
    return sum;
  }

}
