public class NumberOf1 {

    /*  剑指offer--二进制中1的个数
    *   Q: 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
    *   A: 关键：一个整数减一，相当于把最后一个一个1开始的位数都取反，然后与该数进行与运算，从最后一个1开始都变成了0，
    *       所以共有多少个1，就能进行多少次这样的操作
    * */

    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
