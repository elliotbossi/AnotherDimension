import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
    int[]arr = {0,2,1};
    int[][]matrix = {{1,  0, 12, -1 },{7, -2,  2,  1 },{ -5, -2,  2, -9 }};
    System.out.println(ArrayOps.sum(arr));
    System.out.println(ArrayOps.largest(arr));
    System.out.println(Arrays.toString(ArrayOps.sumRows(matrix)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(matrix)));
    System.out.println(ArrayOps.sum(matrix));
    }
}
