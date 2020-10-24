public class minNumberInRotateArray {
    /*  剑指offer--旋转数组中的最小数字
    *   Q: 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
    *   例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
    *   A: 二分法查找、mid = low + (high - low)/2 分三种情况
    *       1、array[mid]>array[high] 最小值在中间，low = mid+1
    *       2、array[mid]==array[high]   [1,1,1,0,1] 无法判断最小数字在mid左边还是右边，high指针只好一步步右移
    *       3、array[mid]<array[high] 最小值在左边，high=mid
    * */

    public int minNumberInRotateArray(int [] array) {
        int low = 0;
        int high = array.length-1;
        while (low<high){
            int mid = low + (high - low)/2;
            if (array[mid]>array[high]){
                low = mid+1;
            }else if (array[mid]==array[high]){
                high = high - 1;
            }else {
                mid = high;
            }
        }
        return array[low];
    }

}
