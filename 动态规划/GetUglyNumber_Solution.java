import java.util.ArrayList;

public class GetUglyNumber_Solution {
    /*  剑指offer--丑数
    *   Q: 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。
    *       习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
    *   A: 关键点：丑数乘丑数还是等于丑数、丑数要按照从小到大的顺序
    *       1、以1为第一个丑数，2、3、5作为三个动态的数列
    *       2、用第一个丑数分别相乘2、3、5，从结果中取最小的一个作为第二丑数
    *       3、第三个丑数的获取重复2的动作
    *
    * */

    public int GetUglyNumber_Solution(int index) {
        if (index <= 0)return 0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(1);
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (res.size()<index){
            int m2 = res.get(i2)*2;
            int m3 = res.get(i3)*2;
            int m5 = res.get(i5)*2;
            int min = Math.min(m2,Math.min(m3,m5));
            res.add(min);
            if (min == m2) i2++;
            if (min == m3) i3++;
            if (min == m5) i5++;
        }
        return res.get(res.size()-1);
    }
}
