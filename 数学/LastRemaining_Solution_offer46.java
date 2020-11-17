public class LastRemaining_Solution_offer46 {

    //约瑟夫环问题，推倒公式
    public int LastRemaining_Solution(int n, int m) {
        if (n == 0) return -1;
        if (n == 1) {
            return 0;
        }else {
            return (LastRemaining_Solution(n-1,m)+m)%n;
        }
    }
}
