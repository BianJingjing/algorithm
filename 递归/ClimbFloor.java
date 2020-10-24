public class ClimbFloor {
    public static void main(String[] args){
        System.out.println(climb(16));
    }
    public static int climb(int n){
        int one = 1;
        int two = 2;
        if (n <= 0) return 0;
        if (n == 1) return one;
        if (n == 2) return two;
        int result = 0;
        for (int i = 2; i < n; i++){
            result = one + two;
            one = two;
            two = result;
        }
        return result;
    }
}
