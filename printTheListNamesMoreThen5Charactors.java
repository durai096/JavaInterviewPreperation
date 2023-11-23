package JavaCommonQA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class printTheListNamesMoreThen5Charactors {
    public static void main(String[] args) {
        String [] stringArray={"Raja","Rani","Durai","Yuvarani","Rajadurai"};
//        List<String> nameList= Arrays.asList("Raja","Rani","Durai","Yuvarani","Rajadurai");
        List<String>nameList=Arrays.asList(stringArray);
        List<String> FiltrednameList= nameList.stream().filter(names->names.length()>5).collect(Collectors.toList());
        System.out.println("Count of more then 5: "+FiltrednameList.size());
//        FiltrednameList.forEach(System.out::println);
    }
}
