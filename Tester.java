import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
    int[]arr = {1,3,5};
    int[][]matrix = {{1,  0, 12, -1 },{7, -2,  2,  1 },{ -5, -2,  2, -9 }};
    int[][]x = {{4,2,2,2},{1,1,4,4},{2,4,1,1}};
    int[][]e = {{2,4,2},{2,2,2}};
    System.out.println(ArrayOps.sum(arr));
    System.out.println(ArrayOps.largest(arr));
    System.out.println(Arrays.toString(ArrayOps.sumRows(matrix)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(matrix)));
    System.out.println(ArrayOps.sum(matrix));
    System.out.println(Arrays.toString(ArrayOps.sumCols(matrix)));
    System.out.println(ArrayOps.isRowMagic(x));
    System.out.println(ArrayOps.isColMagic(x));
    System.out.println(ArrayOps.isLocationMagic(e,0,1));
    System.out.println(ArrayOps.isLocationMagic(e,1,1));
    }
}
