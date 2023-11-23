package JavaCommonQA;

public class swapTheString {
    public static void main(String[] args) {
        String str1="Raja";
        String str2="Rani";
        System.out.println("Before swap: "+str1);
        System.out.println("Before swap: "+str2);
        str1=str1+str2;
        str2=str1.substring(0,(str1.length() - str2.length()));
        str1=str1.substring((str2.length()));
        System.out.println("After swap: "+str1);
        System.out.println("After swap: "+str2);
    }
}
