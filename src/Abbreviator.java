import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Abbreviator {
    public static String abbreviate(String string) {
        StringBuilder abbStr = new StringBuilder();
        int count=-1;
        for(int i=0;i<string.length();i++){
            if(!Character.isLetter(string.charAt(i))){
                abbStr.append(string.charAt(i));
                count=-1;
            }else if(count==-1){
                abbStr.append(string.charAt(i));
                count++;
            }else if(Character.isLetter(string.charAt(i))&&i+1<string.length()&&Character.isLetter(string.charAt(i+1))) count++;
            else if(count>1) abbStr.append(count+""+string.charAt(i));
            else abbStr.append(count==1?string.substring(i-1,i+1):string.charAt(i));
        }
        return abbStr.toString();
    }

    public static void main(String[] args) {
        System.out.println(abbreviate("monolithic; doggy-cat the sat"));
    }
    // monolithic; doggy-cat the sat
    // m8c; d3y-cat the sat
}
