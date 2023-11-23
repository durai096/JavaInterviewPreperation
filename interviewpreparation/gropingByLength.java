package JavaCommonQA.interviewpreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class gropingByLength {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("i","have","a","sentence","with","technical","word");
       Map<Integer, List<String>> groupByLength= words.stream().collect(Collectors.groupingBy(l->l.length()));
        System.out.println(groupByLength);
    }
}
