package JavaCommonQA.Java8;

public class checkNumberPolndromeOrNot {
    public static void main(String[] args) {
        int num=3553;
        int reverseNum=0;
        int remainder;
        int orginalNumber=num;
        while(num !=0 ){
            remainder= num %10;
            reverseNum=reverseNum*10 +remainder;
            num =num/10;
        }
        if (orginalNumber==reverseNum){
            System.out.println(orginalNumber + " is polindrome");
        }
        else{
            System.out.println(orginalNumber + " is not polindrome");
        }
    }
}
