package JavaCommonQA.interviewpreparation;

public class ReverseTheNumber {
    public static void main(String[] args) {
        int number = 1551;
        int orginalNum = number;
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        if (orginalNum == reverse) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
