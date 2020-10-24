import java.util.*;

public class findCommonString {

    /**
     *
     * @param values string字符串ArrayList<ArrayList<>>
     * @return string字符串ArrayList
     */
    public ArrayList<String> findCommonString (ArrayList<ArrayList<String>> values) {
        // write code here
        ArrayList<String> res = new ArrayList<>();
        int size = values.size();
        HashSet<String> hashSet = new HashSet<>();
        for (int i  = 0; i < size; i++){
            ArrayList<String> strings = values.get(i);
            int count = 0;
            for (int j = 0; j < strings.size(); j++){
                if (hashSet.contains(strings.get(j))){
                    count++;
                    if (count == size-1) res.add(strings.get(i));
                }else {
                    hashSet.add(strings.get(j));
                }

            }
        }
        return res;
    }

}
