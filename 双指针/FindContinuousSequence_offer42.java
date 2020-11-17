import java.util.ArrayList;

public class FindContinuousSequence_offer42 {

    //使用双指针形成一个滑动窗口
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int low = 1;
        int high = 2;
        while (high > low){
            int cur = (high + low) * (high - low + 1) / 2;
            if (cur == sum){
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = low; i <= high; i++) {
                    list.add(i);
                }
                result.add(list);
                low++;
            }else if (cur < sum){
                high++;
            }else {
                low++;
            }
        }
        return result;
    }
}
