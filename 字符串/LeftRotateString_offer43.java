public class LeftRotateString_offer43 {

    public String LeftRotateString(String str,int n) {
        /*if (n > str.length()) return str;
        return str.substring(n) + str.substring(0,n);*/

        //使用两次反转，YX=（XTYT)T   X的转置Y的转置的转置
        if (n > str.length()) return str;
        int len = str.length();
        char[] arr = str.toCharArray();
        reverse(arr, 0, n-1);
        reverse(arr, n, len-1);
        reverse(arr, 0, len-1);
        return new String(arr);
    }

    private void reverse(char[] arr, int i, int j) {
        while (i <= j){
            swap1(arr, i++, j--);
        }
    }

    private void swap1(char[] arr, int i, int j) {
        char temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
