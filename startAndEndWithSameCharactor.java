package JavaCommonQA;

import java.util.Arrays;
import java.util.List;

public class startAndEndWithSameCharactor {
    public static void main(String[] args) {
        List<String>arryList= Arrays.asList("abb","aba","bcb","dcd");
        arryList.stream().filter(s->s.endsWith(String.valueOf(s.charAt(0)))).forEach(System.out::println);
    }

}
