public class JumpFloor {
    /*  剑指offer--跳台阶
    *   A: 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
    *   Q: 找规律，发现跳到第一个台阶的方法为1中，第二个台阶方法为2种，第三个台阶有两种方法，即第一个台阶的方法跳两步和第二个台阶的方法跳三步
    *       所以，跳到第n个台阶的方法就是跳到第n-1个台阶的方法和跳到第n-2个台阶的方法之和
    *       类比斐波那契数列
    * */

    public int JumpFloor(int target) {
        int one = 1;
        int two = 2;
        if (target<=0) return 0;
        if (target == 1) return one;
        if (target == 2) return two;
        int result =0;
        for (int i =2; i < target; i++){
            result = one + two;
            one = two;
            two = result;
        }
        return result;
    }
}
