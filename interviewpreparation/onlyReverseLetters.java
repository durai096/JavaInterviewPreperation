package JavaCommonQA.interviewpreparation;

public class onlyReverseLetters {
    public static void main(String[] args) {
        String str="123Raja";
       str= str.replaceAll("\\p{L}+","");
       String reverse="";
       for (int i=str.length()-1;i>=0;i--){
           reverse=reverse+str.charAt(i);
       }
        System.out.println(reverse);

    }
}
