package JavaCommonQA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class upperCaseAndRemoveDoupleQuats {
    public static void main(String[] args) {
        List<String>name= Arrays.asList("Raja", "Rani", "Ravi", "Yuva", "Durai");
       String UpperCase= name.stream().map(s->s.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(UpperCase);
    }
}
