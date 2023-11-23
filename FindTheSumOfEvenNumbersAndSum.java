package JavaCommonQA;

import java.util.Arrays;

public class FindTheSumOfEvenNumbersAndSum {
    public static void main(String[] args) {
        int [] numbers={1,2,3,4,5,6,7,8,9,10};
       int sumEvenNumbers= Arrays.stream(numbers).filter(i->i%2==0).sum();
        System.out.println("Sum Of Even Numbers: "+sumEvenNumbers);
       int sumOfOddNumbers= Arrays.stream(numbers).filter(i->i%2!=0).sum();
        System.out.println("Sum Of Odd Numbers: "+sumOfOddNumbers);

    }
}
