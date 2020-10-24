public class JumpFloorII {
    /*  剑指offer--变态跳台阶
    *   Q: 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
    *   A: 本题采用动态规划解决问题：第n阶台阶，可以从1、2、3、...、n-1级台阶跳上去，即f(1)、f(2)、f(3)、...、f(n-1)中途径
    *       1、状态转移方程 f(n) = f(n-1)+f(n-2)+...+f(1)
    *       2、需要从小到大计算，并加以缓存
    * */
    public int JumpFloorII(int target) {
        if (target == 0) return 0;

        int[] dp = new int[target+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= target; i++){
            dp[i]=0;
            for (int j = 0; j < i; j++){
                dp[i] += dp[j];
            }
        }
        return dp[target];
    }
}
