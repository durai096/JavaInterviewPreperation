package JavaCommonQA;

import java.util.Arrays;
import java.util.List;

public class SquareTheEvenNumbersAndSum {
    public static void main(String[] args) {
//        int [] array={1,2,3,4,5};
        List<Integer>list= Arrays.asList(1,2,3,4,5);
        int SquareEvenNUmberAndSum=list.stream().filter(num->num%2==0).mapToInt(num->num*num).sum();
        System.out.println("Square The Even NUmber And Sum:"+ SquareEvenNUmberAndSum);
        int SquareOddNUmberAndSum=list.stream().filter(num->num%2!=0).mapToInt(num->num*num).sum();
        System.out.println("Square Odd NUmber And Sum:"+SquareOddNUmberAndSum);
    }
}
