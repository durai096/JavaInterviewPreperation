package JavaCommonQA;

public class reverseTheNumber {
    public static void main(String[] args) {
        int number=12345;
        int reverse=0;
        StringBuilder sb=new StringBuilder(String.valueOf(number));
       reverse=Integer.valueOf(sb.reverse().toString());
        System.out.println(reverse);
    }

}
