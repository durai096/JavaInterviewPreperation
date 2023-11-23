package JavaCommonQA.interviewpreparation;

public class palindromeCheck {
    public static void main(String[] args) {
        int num=3553;
        int reverse=0;
        int orginal=num;
        while(num!=0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        if (reverse==orginal){
            System.out.println(orginal+ ": isPalindrome");
        }else {
            System.out.println(orginal+ ": not Palindrome");
        }
    }
}
