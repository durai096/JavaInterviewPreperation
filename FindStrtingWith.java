package JavaCommonQA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindStrtingWith {
//write a program to find in list which started with 'R'
// input ["Raja","Yuva","Rani"]
// output ["Raja",Rani]
public static void main(String[] args) {
    String input[]={"Raja","Yuva","Rani","ravi"};
    List<String>list=new ArrayList<>();
    for (String value:input){
        list.add(value);
    }
//    List<String>list=new ArrayList<>(Arrays.asList(input));
    list.stream().filter(name->name.startsWith("R")).forEach(System.out::println);
}
}
