import java.util.ArrayList;

public class FindNumbersWithSum {

    /*  剑指offer--和为S的两个数字
    *   Q: 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
    *   A: 左右指针；至于输出两个数的乘积最小的，通过证明发现（a-m）*（b+m）< a*b ,在左右夹逼的方法下，会先取到两个数的乘积最小的数
    * */

    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array == null || array.length == 0){
            return list;
        }
        int left = 0;
        int right = array.length-1;
        while(left < right){
            int total = array[left]+array[right];
            if (total > sum){
                right--;
            }else if (total < sum){
                left++;
            }else {
                list.add(array[left]);
                list.add(array[right]);
                return list;
            }
        }
        return list;
    }
}
