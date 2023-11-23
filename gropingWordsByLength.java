package JavaCommonQA;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class gropingWordsByLength {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("i","have","a","sentence","with","technical","word");
       Map<Integer,List<String>>lengthmap= words.stream().collect(Collectors.groupingBy(gr->gr.length()));
        System.out.println(lengthmap);
    }
}
