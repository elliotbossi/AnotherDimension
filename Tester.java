import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
    int[]arr = {0,2,1};
    int[][]matrix = {{1,2},{1,3}};
    System.out.println(ArrayOps.sum(arr));
    System.out.println(ArrayOps.largest(arr));
    System.out.println(Arrays.toString(ArrayOps.sumRows(matrix)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(matrix)));
    }
}
