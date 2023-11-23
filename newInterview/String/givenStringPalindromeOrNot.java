package JavaCommonQA.newInterview.String;

public class givenStringPalindromeOrNot {
    public static void main(String[] args) {
        String str="Amma";
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        if (str.toLowerCase().equals(reverse.toLowerCase())){
            System.out.println(str+ " is Palindrome");
        }else {
            System.out.println(str+ "Not a Palindrome");
        }
    }
}
