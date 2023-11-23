package JavaCommonQA.newInterview;

import java.util.HashSet;
import java.util.Set;

public class panagramOrNot {
    public static void main(String[] args) {
        String str="The quick brown fox jumps over the lazy dog";
        System.out.println(isPanagaram(str));
    }
    public static boolean isPanagaram(String s){
        Set<Character>set=new HashSet<>();
        s=s.toLowerCase();
        for (char ch:s.toCharArray()){
           if (Character.isLetter(ch)){
               set.add(ch);
           }
        }
        return set.size()==26;

    }
}
