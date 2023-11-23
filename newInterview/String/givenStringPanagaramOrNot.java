package JavaCommonQA.newInterview.String;
import java.util.HashSet;
import java.util.Set;
public class givenStringPanagaramOrNot {
    public static void main(String[] args) {
        String str="The quick brown fox jumps over the lazy dog";
        if (isPanagram(str)){
            System.out.println(str+ " isPanagram");
        }
        else {
            System.out.println(str+ " isNotPanagram");
        }
    }
    public static boolean isPanagram(String s){
        s=s.toLowerCase();
        Set<Character>set=new HashSet<>();
        for (Character ch:s.toCharArray()){
            if (Character.isLetter(ch)){
                set.add(ch);

            }
        }
        return set.size()==26;
    }
}
