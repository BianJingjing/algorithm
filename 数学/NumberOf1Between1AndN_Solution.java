public class NumberOf1Between1AndN_Solution {
    /*  剑指offer--整数中1出现的次数
    *   Q: 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
    *   但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
    *   A: 设定整数点作为位置点i，分别对每个数位上包含多少个i进行统计
    *       1、i>=2, （n/i/10 + 1）个i
    *       2、i=1， n/i/10 个i + n%i+1
    *       3、i=0， n/i/10 个i
    *       综上三种情况，当i=0和i>=2时，有连续的n/i/10个i的1，当i=1时，需要增加n%i+1 个局部点，但是i>=2时，需要补位8，此时有n/i/10 + 1个i的1
    * */
    public int NumberOf1Between1AndN_Solution(int n) {
        if (n <= 0) return 0;
        int count = 0;
        for (int i = 1; i < n; i*=10){
            int a = n / i;
            int b = n % i;
            count += (a + 8) / 10 * i + (a % 10 == 1 ? b + 1 : 0);
        }
        return count;
    }
}
