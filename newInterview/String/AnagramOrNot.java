package JavaCommonQA.newInterview.String;
import java.util.Arrays;
public class AnagramOrNot {
    public static void main(String[] args) {
        String str1="peek";
        String str2="keep";
        if (isAnagram(str1,str2)){
            System.out.println(str1+" and "+str2+ " Is Anagram");
        }
        else {
            System.out.println(str1+" and "+str2+ " Is Not A Anagram");
        }
    }
    public static boolean isAnagram(String s1,String s2){
        s1=s1.replaceAll("\\p{Zs}","").toLowerCase();
        s2=s2.replaceAll("\\p{Zs}","").toLowerCase();
        if (s1.length()!=s2.length()){
            return false;
        }
        char[] charArray1=s1.toCharArray();
        char[] charArray2=s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);

    }
}
