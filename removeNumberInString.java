package JavaCommonQA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class removeNumberInString {
    public static void main(String[] args) {
        


        String str="abc123def";
        char [] charArray=str.toCharArray();
     String  NumberRemove=  str.replaceAll("\\p{N}","");
        System.out.println(NumberRemove);

    }
}
