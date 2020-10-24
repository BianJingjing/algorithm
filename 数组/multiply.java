public class multiply {

    /*  剑指offer--构建乘积数组
    *   Q: 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
    *   （注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）对于A长度为1的情况，B无意义，故而无法构建，因此该情况不会存在。
    * */

    public int[] multiply(int[] A) {
        int[] num = new int[A.length];
        if(A.length <= 1) return num;
        for(int i = 0; i < num.length; i++){
            num[i]=1;
            for(int j = 0; j < A.length; j++){
                if(i != j){
                    num[i] *= A[j];
                }
            }
        }
        return num;
    }
}
