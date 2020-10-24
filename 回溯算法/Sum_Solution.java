public class Sum_Solution {
    /*  剑指offer--求1+2+3+...+n
    *   Q: 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
    *   A: 问题的关键是用逻辑与的短路特性来实现判断功能
    *       1、如果n>0, 执行sum += Sum_Solution(n-1)，进行回溯
    *       2、如果n<=0, 逻辑与的左边为false，右边不执行，回溯终止。
    * */

    public int Sum_Solution(int n){
        int sum = n;
        boolean flag = (n>0) && ((sum += Sum_Solution(n-1)) > 0);
        return sum;
    }
}
