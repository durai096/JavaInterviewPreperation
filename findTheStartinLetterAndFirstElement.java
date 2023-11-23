package JavaCommonQA;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class findTheStartinLetterAndFirstElement {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("Raja","Durai","Rani","Yuva");
       Optional<String> FindFirstStartElement = list.stream().filter(name->name.startsWith("R")).findFirst();
        System.out.println(FindFirstStartElement);
    }


}
