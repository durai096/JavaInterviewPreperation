package JavaCommonQA.Java8;

public class polindrome {
    public static void main(String[] args) {
        String str="mam";
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        if (str.toLowerCase().equals(reverse.toLowerCase())){
            System.out.println(str + " is polindrome");
        }
        else {
            System.out.println(str + " not polindrome");
        }
    }
}
