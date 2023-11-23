package JavaCommonQA;

import java.util.Arrays;

public class countTheWordsWithoutSpecial {
    public static void main(String[] args) {
        String str="artbc, cder, zeot";
       int count=0;
//       Long count= Arrays.stream(str.split("[^\\p{Zs}+\\,]")).count();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)!=' ' &&str.charAt(i)!=','){
                count++;
            }
        }
        System.out.println(count);
    }
}
