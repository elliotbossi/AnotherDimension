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
    int i = 0;
    int arr[] = new int[matrix.length];
    while (i < matrix.length) {
      arr[i] = sum(matrix[i]);
      i = i + 1;
    }
    return arr;
  }

  public static int[] largestInRows(int[][] matrix) {
    int i = 0;
    int x = 0;
    int arr[] = new int[matrix.length];
    while (i < matrix.length) {
      arr[i] = largest(matrix[i]);
      i = i + 1;
    }
    return arr;
  }


  public static int sum(int[][] arr) {
    int sum = 0;
    int i = 0;
    int x = 0;
    while (i < arr.length) {
      x = 0;
      while (x < arr[i].length) {
        sum = sum + arr[i][x];
        x = x + 1;
      }
      i = i + 1;
    }
    return sum;
  }

  public static int[] sumCols(int[][] matrix) {
    int i = 0;
    int x = 0;
    int bruh = matrix[0].length;
    int arr[] = new int[bruh];
    while (x < bruh) {
      i = 0;
      while (i < matrix.length) {
        arr[x] = arr[x] + matrix[i][x];
        i = i + 1;
      }
      x = x + 1;
    }
    return arr;
  }

  public static boolean isRowMagic(int[][] matrix) {
    int arr[] = sumRows(matrix);
    boolean result = false;
    int i = 1;
    int x = arr.length - 1;
    int y = 0;
    while (i < arr.length) {
      if (arr[i] == arr[i-1]) {
        y = y + 1;
      }
      i = i + 1;
    }
    return (x == y);
  }
}
