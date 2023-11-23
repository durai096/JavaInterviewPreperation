package JavaCommonQA.newInterview.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findSecondSmallestElement {
    int [] arr={3,1,2,4,5};
    public static void main(String[] args) {
        List<Integer>list=Arrays.asList(3,1,2,4,5);
        List<Integer> SeconSmallest=list.stream().distinct().sorted().collect(Collectors.toList()).stream().skip(0).collect(Collectors.toList());
        System.out.println(SeconSmallest);

    }
}
