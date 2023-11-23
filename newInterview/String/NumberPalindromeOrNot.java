package JavaCommonQA.newInterview.String;

public class NumberPalindromeOrNot {
    public static void main(String[] args) {
        int number=12345;
        int reversed=0;
        int remainder;
        int originalNumber=number;
        while (number !=0){
            remainder=number%10;
            reversed=reversed*10+remainder;
            number=number/=10;

        }
        System.out.println("Reversed NumberIs: "+ reversed);
        if (originalNumber==reversed){
            System.out.println(originalNumber + ": Is Palindrome");
        }else {
            System.out.println(originalNumber + ": Is Not Palindrome");
        }
    }
}
