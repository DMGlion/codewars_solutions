import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Comparator;
public class WeightSort {

    public static String orderWeight(String strng) {
        String[] strings = strng.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            int i = 0;
            for (char c : s.toCharArray()) {
                i += c - '0';
            }
            map.put(s, i);
        }

        Arrays.sort(strings, (s1, s2) -> {
            int i = map.get(s1).compareTo(map.get(s2));
            if(i == 0){
                i = s1.compareTo(s2);
            }
            return i;
        });

        return String.join(" ", strings);
    }

    public static void main(String[] args) {
        WeightSort.orderWeight("103 123 4444 99 2000");
    }
}
