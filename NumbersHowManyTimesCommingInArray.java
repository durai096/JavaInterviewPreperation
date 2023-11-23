package JavaCommonQA;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumbersHowManyTimesCommingInArray {
    public static void main(String[] args) {
        int [] numbers={1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        List<Integer>list=new ArrayList<>();
        for (int value :numbers){
            list.add(value);
        }
        System.out.println("Before Counting: " +list);
        Map<String,Long>CountNumbers=list.stream().collect(Collectors.groupingBy(s-> String.valueOf(s),Collectors.counting()));
        System.out.println("After Counting: "+CountNumbers);
    }
}
