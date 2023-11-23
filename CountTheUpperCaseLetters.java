package JavaCommonQA;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountTheUpperCaseLetters {
    public static void main(String[] args) {
        String str="Raja LovEe RaNi";
        Long count=Arrays.stream(str.split("\\p{Ll}+")).count();
//        int count=0;
//        for (char c:str.toCharArray()){
//            if (Character.isUpperCase(c)){
//                count++;
//            }
//        }
        System.out.println(count);
    }
}
