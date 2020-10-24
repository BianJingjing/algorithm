public class Fibonacci {
    /*  剑指offer--斐波那契数列
    *   Q: 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。n<=39
    *   A: 前两项 0,1
    *       1、设置前两项的初始值
    *       2、进行递归
    * */
    public int Fibonacci(int n) {
        int one = 0;
        int two = 1;
        if (n <= 0) return one;
        if (n == 1) return two;
        int result = 0;
        for (int i = 2; i <= n; i++){
            result = one + two;
            one = two;
            two = result;
        }
        return result;
    }
}
