package JavaCommonQA;

import java.util.Arrays;
import java.util.List;
public class countTheListWordsGrtFive {
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("Raja","Rani","Rajadurai","yuvarani");
       Long Count=stringList.stream().filter(s->s.length()>4).count();
        System.out.println(Count);
    }
}
