import java.util.ArrayList;

public class printMatrix {

    /*  剑指offer--顺时针打印矩阵
    *   Q: 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵：
    *   1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
    *   A: 注意边界问题、一行多列和一列多行型的矩阵
    *
    * */

    public static void main(String[] args) {
        System.out.println(printMatrix(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}));
    }

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        int xlen = matrix.length;
        int ylen = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = 0;
        while(n < Math.ceil(0.5*Math.min(xlen,ylen))){
            for (int j = n; j < ylen-n; j++){
                list.add(matrix[0+n][j]);
            }
            for (int i = n+1; i < xlen-n; i++){
                list.add(matrix[i][ylen-n-1]);
            }
            for (int j = ylen-n-1-1; j >= n; j--){
                if (0+n != xlen-n-1){
                    list.add(matrix[xlen-n-1][j]);
                }
            }
            for (int i = xlen-n-1-1; i > n; i--){
                if (0+n != ylen-n-1){
                    list.add(matrix[i][0+n]);
                }
            }
            n++;
        }
        return list;
    }
}
