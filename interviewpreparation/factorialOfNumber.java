package JavaCommonQA.interviewpreparation;

public class factorialOfNumber {
    public static void main(String[] args) {
        int fact=1;
        int num=5;
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("The Factorial Of 5 is: "+fact);
    }
}
