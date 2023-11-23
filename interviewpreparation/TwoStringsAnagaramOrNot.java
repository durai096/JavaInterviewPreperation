package JavaCommonQA.interviewpreparation;

import java.util.Arrays;

public class TwoStringsAnagaramOrNot {
    public static void main(String[] args) {
        String str1="keep";
        String str2="Peek";
        if (isAnagaram(str1,str2)){
            System.out.println(str1+"and"+str2+" is Annagaram");
        }else {
            System.out.println("Not Annagram");
        }
    }
    public static boolean isAnagaram(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char[] charArray1= str1.toCharArray();
        char[] charArray2= str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);
    }
}
