package JavaCommonQA;

public class swapTwoNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before sap: "+a);
        System.out.println("Before sap: "+b);
        a=a+b;//30
        b=a-b;//30-20=10
        a=b-a;//30-10=20
    }
}
