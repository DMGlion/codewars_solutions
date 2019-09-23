import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
    public static char findMissingLetter(char[] array)
    {
        String values = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String [] alphabet = values.split("");
        List<String> arrList = Arrays.asList(alphabet);

        int start = values.indexOf(array[0]);
        int end = array.length;

        for (int i = 0; i<end; i++){
            if (!(arrList.get(start+i).charAt(0)==(array[i]))){
                return (arrList.get(start+i)).charAt(0);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[] { 'a','b','c','d','f' }));
    }
}
