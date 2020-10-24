import java.util.HashMap;
import java.util.Map;

public class MoreThanHalfNum_Solution {
    public static void main(String[] args){
        MoreThanHalfNum_Solution(new int[]{1,2,3,2,2,2,5,4,2});
    }
    /*  剑指offer--数组中出现次数超过一半的数字
    *   Q: 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
    *       由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
    *   A: 利用hashmap来存储数组元素和重复次数
    * */

    public static int MoreThanHalfNum_Solution(int[] array) {
        int m = array.length / 2;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < array.length; i++){

            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else{
                map.put(array[i],1);
            }

            if(map.get(array[i]) > m){
                return array[i];
            }
        }
        return 0;
    }
}
