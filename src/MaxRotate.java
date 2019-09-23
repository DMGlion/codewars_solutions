import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxRotate {

    public static long maxRot (long n) {
        // your code
        String value = String.valueOf(n);
        int lenghtInput = value.length();
        List<String> listValues = new ArrayList<>(Arrays.asList(value.split("")));
        List<Long> endValues = new ArrayList<>();
        endValues.add(n);

        for (int i = 0; i<listValues.size()-1; i++){
            if (i==0){
                String single = listValues.get(0);
                String end = value.substring(i+1, lenghtInput);
                long result = Long.parseLong(end + single);
                endValues.add(result);
                value = end + single;
            }
            else{
                listValues.clear();
                listValues = new ArrayList<>(Arrays.asList(value.split("")));
                String start = value.substring(0,i);
                String end = value.substring(i, lenghtInput);
                String single = end.substring(0,1);
                long result = Long.parseLong(start + end.substring(1,end.length()) + single);
                endValues.add(result);
                value = start + end.substring(1,end.length()) + single;
            }
        }
        return Collections.max(endValues);
    }


    public static void main(String[] args) {
        System.out.println(MaxRotate.maxRot(1000646242));
    }
}
