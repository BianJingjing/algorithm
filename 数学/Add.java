public class Add {

    /*  剑指offer--不用加减乘除做加法
    *   Q: 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
    *   A: 转化为二进制，类比十进制加法，现将各位数分别相加，再加进位
    *      二进制中各位相加使用异或，进位使用与运算再向左移一位，将两次运算结果相加获得
    * */

    public int Add(int num1,int num2) {
        while (num2 != 0){
            int temp = num1 ^ num2;
            num2 = (num1&num2)<<1;
            num1 = temp;
        }
        return num1;
    }
}
