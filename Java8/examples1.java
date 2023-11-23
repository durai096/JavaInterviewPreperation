package JavaCommonQA.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class examples1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "World", "Java", "StreamS","Streams");
        Map<String,Long> CountWordsPresent=words.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
                System.out.println("CountWordsPresent: " + CountWordsPresent);
              List <String> StartWith= words.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println("StartWith: "+StartWith);



    }
}
