package JavaCommonQA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mergeTheTwoArraysUsingJava8 {
    public static void main(String[] args) {
//        int [] array1={1,2,3,4,5,6};
//        int [] array2={1,2,3,4,5,6,7,8,9,10};

        List<Integer> list1=Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //adding two list
        Stream<Integer>fullList= Stream.concat(list1.stream(),list2.stream());
        //combine two list to one list
         List<Integer> allElement=fullList.collect(Collectors.toList());
        System.out.println("combine two list to one list: "+allElement);
        //withoutDuplicates
        List<Integer> withoutDuplicates= allElement.stream().distinct().collect(Collectors.toList());
        System.out.println("Without Duplicates: "+withoutDuplicates);
        int minNumber=withoutDuplicates.stream().min((x1,x2)->x1-x2).get();
        System.out.println("minNumber :"+minNumber);
        int maxNumber= withoutDuplicates.stream().max((x1,x2)->x1-x2).get();
        System.out.println("maxNumber :"+maxNumber);


    }
}
