import java.util.ArrayList;

public class GetMedian {

    /*  剑指offer--数据流中的中位数
    *   Q: 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
    *   如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
    *   A: 插入mum时，有序插入,保证指针指向中位数
    * */

    public ArrayList<Integer> cache = new ArrayList<>();
    public int len = 0;
    public int mid_1 = 0;
    public void Insert(Integer num) {
        if (len == 0){
            cache.add(num);
        }else {
            int i = mid_1;
            if (num > cache.get(mid_1)){
                while (i < len && num > cache.get(i)){
                    i++;
                }
                cache.add(i,num);
                if (len%2 == 0){
                    mid_1++;
                }
            }else {
                while (i >= 0 && num < cache.get(i)){
                    i--;
                }
                cache.add(i+1,num);
                if (len%2 == 0){
                    mid_1++;
                }
            }

        }
        len++;
    }

    public Double GetMedian() {
        if (len%2 == 0){
            return (cache.get(mid_1)+cache.get(mid_1+1))/2.0;
        }else {
            return cache.get(mid_1)/1.0;
        }
    }
}
