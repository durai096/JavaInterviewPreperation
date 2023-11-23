package JavaCommonQA.interviewpreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberHowManyTimesPresentInAnArray {
    public static void main(String[] args) {
        int[] arr={6,2,3,4,5,4,4};
        List<Integer>list= Arrays.asList(6,2,3,4,5,4,4);
       Map<Integer,Long>countOccurenceOfNumbers= list.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
        System.out.println(countOccurenceOfNumbers);
        int toFount=4;
        int count=0;

//        for (int value:arr){
//            if (toFount==value){
//                count++;
//            }
//        }
       // System.out.println(count);
    }
}
