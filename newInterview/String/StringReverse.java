package JavaCommonQA.newInterview.String;

public class StringReverse {
    public static void main(String[] args) {
        String str="Raja";
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println("Reversed String is: "+reverse);
    }
}
