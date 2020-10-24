import java.util.*;


public class house {
    /**
     *
     * @param person int整型一维数组
     * @return int整型
     */
    public int house (int[] person) {
        // write code here
        int count = 0;
        for (int i = 0; i < person.length; i++){
            count+=houseCore(person,i);
        }
        return count;
    }
    public int houseCore(int[] p, int i){
        if (i == 0){
            if (p[i] > p[i+1]){
                return houseCore(p,i+1)+1;
            }else {
                return 1;
            }
        }else if (i == p.length-1){
            if (p[i] > p[i-1]){
                return houseCore(p,i-1)+1;
            }else {
                return 1;
            }
        }else {
            if (p[i+1] >= p[i] && p[i-1] >= p[i]){
                return 1;
            }
            if (p[i+1] <= p[i] && p[i-1] >= p[i]){
                return houseCore(p,i+1)+1;
            }
            if (p[i-1] < p[i] && p[i+1] >= p[i]){
                return houseCore(p,i-1)+1;
            }
            if (p[i] >= p[i-1] && p[i] >= p[i+1]){
                return houseCore(p,i-1)+1;
            }
        }
        return 1;
    }
}
