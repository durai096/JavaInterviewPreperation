package JavaCommonQA.Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class combineTwoArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        List<Integer>list1=Arrays.asList(1,2,3,5);
        List<Integer>list2=Arrays.asList(4,5,6,2);
        List<Integer>CombineTwoArray=Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
//       List<Integer>FullList= CombineTwoArray.collect(Collectors.toList());
        System.out.println("CombineTwoArray: "+CombineTwoArray);
        List<Integer>SortedArray=CombineTwoArray.stream().sorted().collect(Collectors.toList());
        System.out.println("SortedArray: "+SortedArray);
        List<Integer> ReverseArray=CombineTwoArray.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("ReverseArray: "+ReverseArray);
       List<Integer> RemoveDuplicates=CombineTwoArray.stream().distinct().collect(Collectors.toList());
        System.out.println("RemoveDuplicates: "+RemoveDuplicates);
        int Maxvalue=RemoveDuplicates.stream().max((x1,x2)->x1-x2).get();
        System.out.println("MaxValue: "+Maxvalue);
        int minValue=RemoveDuplicates.stream().min((x1,x2)->x1-x2).get();
        System.out.println("MinValue: "+minValue);
        Set<Integer>set=new LinkedHashSet<>();
        List<Integer>DuplicatesOnly=CombineTwoArray.stream().filter(s->!set.add(s)).collect(Collectors.toList());
        System.out.println("DuplicatesOnly: "+DuplicatesOnly);
    }
}
