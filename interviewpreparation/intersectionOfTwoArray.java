package JavaCommonQA.interviewpreparation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class intersectionOfTwoArray {
    public static void main(String[] args) {
        int [] firstArray={1,2,3,4};
        int [] secondArray={2,3,1};
//        List<Integer>list1= Arrays.asList(1,2,3,4);
//        List<Integer>list2= Arrays.asList(2,3,1);
        Arrays.stream(firstArray).filter(first->Arrays.stream(secondArray).anyMatch(second->first==second)).forEach(System.out::println);

    }
}
