public class GetNumberOfK {
    /*  剑指offer--
    *   Q: 统计一个数字在升序数组中出现的次数。
    *   A: 升序 -> 二分法
    *       获取前一个k和最后一个位置，进行相减
    *
    * */

    public int GetNumberOfK(int [] array , int k) {
        int len = array.length;
        if (len == 0){
            return 0;
        }
        int firstK = getFirstK(array, k, 0, len-1);
        int lastK = getLastK(array, k, 0, len-1);
        if (firstK != -1 && lastK != -1){
            return lastK - firstK + 1;
        }
        return 0;
    }
    //使用循环算法
    private int getLastK(int[] array, int k, int start, int end) {
        int len = array.length;
        int mid = (start + end)/2;
        while (start <= end){
            if (array[mid] < k){
                start = mid+1;
            }else if (array[mid] > k){
                end = mid-1;
            }else if (mid+1 < len && array[mid+1] == k){
                start = mid +1;
            }else {
                return mid;
            }
            mid = (start + end)/2;
        }
        return -1;
    }
    //使用递归算法
    private int getFirstK(int[] array, int k, int start, int end) {
        if(start > end){
            return -1;
        }
        int mid = (start + end)/2;
        if (array[mid] > k){
            return getFirstK(array, k, start, mid-1);
        }else if (array[mid] < k){
            return getFirstK(array, k, mid+1, end);
        }else if(mid-1 >= 0 && array[mid-1] == k){
            return getFirstK(array, k, start, mid -1);
        }else {
            return mid;
        }
    }


}
