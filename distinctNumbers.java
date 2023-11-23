package JavaCommonQA;

import java.util.*;
import java.util.stream.Collectors;

public class distinctNumbers {
    public static void main(String[] args) {
        int [] numbers={10,20,30,20,10};
        List<Integer>list=new ArrayList<>();
        for (int value:numbers){
            list.add(value);
        }
       List<Integer>DistinctNumbers= list.stream().distinct().collect(Collectors.toList());
        System.out.println("DistinctNumbers: "+DistinctNumbers);
        //Finding Duplicates
        Set<Integer>set=new LinkedHashSet<>();
       List<Integer>Duplicates= list.stream().filter(s->!set.add(s)).collect(Collectors.toList());
        System.out.println("Duplicates: "+Duplicates);
    }
}
