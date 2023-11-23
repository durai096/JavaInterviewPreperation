package JavaCommonQA;

import java.util.*;
import java.util.stream.Collectors;

public class findDuplicates {
    public static void main(String[] args) {
        int [] array={2,3,4,2,4};
        List<Integer>list= Arrays.asList(2,3,4,2,4);
//       List<Integer> list= new ArrayList<>();
//        for (int value:array){
//            list.add(value);
//        }
        System.out.println("Before Duplicates:"+ list);
        Set<Integer>set= new LinkedHashSet<>();
       List<Integer>dulicates= list.stream().filter(num->!set.add(num)).collect(Collectors.toList());
        System.out.println("Duplicates:"+dulicates);
    }
}
