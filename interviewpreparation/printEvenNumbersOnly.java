package JavaCommonQA.interviewpreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class printEvenNumbersOnly {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9);
       List<Integer>Even= list.stream().filter(s->s%2==0).collect(Collectors.toList());
        System.out.println("Even Numbers: ");
        Even.forEach(System.out::println);
        List<Integer>Odd= list.stream().filter(s->s%2!=0).collect(Collectors.toList());
        System.out.println("Odd Numbers: ");
        Odd.forEach(System.out::println);

      List<Integer>SqureOfArray=list.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList());
      SqureOfArray.forEach(System.out::println);
        List<Integer>SumOf= list.stream().filter(s->s%2==0).map(s->s+s).collect(Collectors.toList());
        System.out.println("Sum Of: ");
      SumOf.forEach(System.out::println);
    }
}
