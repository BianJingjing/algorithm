public class reOrderArray {
    /*  剑指offer--调整数组顺序使奇数位于偶数前面
    *   Q: 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
    *   并保证奇数和奇数，偶数和偶数之间的相对位置不变。
    *   A: 插入排序
    * */

    public void reOrderArray(int [] array) {
        int m = array.length;
        int k = 0;
        for (int i = 0; i < m; i++){
            if (array[i]%2 == 1){
                int j = i;
                while (j > k){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    j--;
                }
                k++;
            }
        }
    }
}
