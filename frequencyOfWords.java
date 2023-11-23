package JavaCommonQA;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequencyOfWords {
    public static void main(String[] args) {
        List<String>stringList= Arrays.asList("AA","BB","AA","DD","CC","DD");
       Map<String,Long> FrequencyOfTheWord=stringList.stream().filter(words-> Collections.frequency(stringList,words)>1)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(FrequencyOfTheWord);
    }
}
