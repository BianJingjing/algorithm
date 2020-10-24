public class Power {

    /*  剑指offer--数值的整数次方
    *   Q: 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。保证base和exponent不同时为0
    *   A: 对于a^b的分情况讨论，负数、0、正数
    * */

    public double Power(double base, int exponent) {
        int n = Math.abs(exponent);
        if (n == 0)
            return 1;
        if (n == 1)
            return base;
        double result = Power(base, n >> 1);
        result *= result;
        if ((n & 1) == 1)
            result *= base;
        if (exponent < 0)
            result = 1 / result;
        return result;
    }
}
