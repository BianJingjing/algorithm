public class Find {
    /*  剑指offer--二维数组的查找
    *   Q: 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
    *   请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
    *   A: 矩阵是有序的，利用从左往右、从上到下依次增大的特性，选取左下角为起始点，若该点小于target，则向上，若该点大于target，则向右
    *
    * */

    public boolean Find(int target, int [][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int i = rows-1, j = 0;
        while (i > 0 && j < cols){
            if (target > array[i][j]){
                j++;
            }else if (target < array[i][j]){
                i--;
            }else {
                return true;
            }
        }
        return false;
    }
}
