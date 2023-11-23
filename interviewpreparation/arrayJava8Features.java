package JavaCommonQA.interviewpreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class arrayJava8Features {
    public static void main(String[] args) {
        int [] arr={2,3,5,7,8,5};
            List<Integer>list=Arrays.asList(10,3,5,7,8,1,5);
            List<Integer>SortedList=list.stream().sorted().collect(Collectors.toList());
        System.out.println("SortedList"+SortedList);
        List<Integer>DisendingOrder=list.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        System.out.println("DisendingOrder: "+DisendingOrder);
    }
}
