import java.util.Arrays;
import java.util.Comparator;

public class PrintMinNumber {

    /*  剑指offer--把数组排成最小的数
    *   Q: 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
    *   则打印出这三个数字能排成的最小数字为321323。
    *   A: 将int数组转化成String数组，利用comparator进行排序，最后StringBuilder追加String数组中的元素
    * */

    public String PrintMinNumber(int [] numbers) {
        if (numbers == null || numbers.length == 0){
            return "";
        }
        int len = numbers.length;
        String[] strings = new String[len];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++){
            strings[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s1.compareTo(s2);
            }
        });
        for (int i = 0; i < len; i++){
            sb.append(strings[i]);
        }
        return sb.toString();
    }
}
