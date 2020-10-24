public class duplicate {
    /*  剑指offer--数组中的重复数字
    *   Q: 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。
    *   也不知道每个数字重复几次。请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
    *   (题目描述模糊，重新描述为：若找到数组中含有重复数字，则将其添加到duplication中，并返回true；否则返回false)
    *   A: 利用现有数组设置标志
    *       1、根据给出数组设置一个标志数组，默认false
    *       2、若果标志位为true，找到重复数字，返回true
    *       3、遍历过的设置为true
    *       4、遍历结束，返回false
    *
    * */

    public boolean duplicate(int numbers[],int len,int [] duplication) {
        boolean[] flag = new boolean[len];
        for (int i = 0; i < len; i++){
            if (flag[numbers[i]] == true){
                duplication[0] = numbers[i];
                return true;
            }
            flag[numbers[i]] = true;
        }
        return false;
    }
}
