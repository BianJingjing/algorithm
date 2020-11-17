import java.util.LinkedHashMap;

public class FirstAppearingOnce_offer54 {

    LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

    public void Insert(char ch){
        if (map.containsKey(ch)) {
            map.put(ch, -1);
        }else {
            map.put(ch, 1);
        }
    }
    public char FirstAppearingOnce(){
        for (char ch : map.keySet()){
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return '#';
    }
}
