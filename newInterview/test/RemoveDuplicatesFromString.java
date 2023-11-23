package JavaCommonQA.newInterview.test;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str="Raja";
        Set<Character> set=new HashSet<>();
        for (Character c:str.toCharArray()){
            set.add(c);
        }
        System.out.println(set);

    }

}
