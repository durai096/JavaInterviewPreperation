package JavaCommonQA;

import java.util.*;
import java.util.stream.Collectors;

public class java8 {
    public static void main(String[] args) {
        List<Example1> emplist=new ArrayList<>();
        emplist.add(new Example1("AB123","Raja","Java Developer"));
        emplist.add(new Example1("AB124","Raja","Python Developer"));
        emplist.add(new Example1("AB125","yuva","Angular Developer"));
        emplist.add(new Example1("AB126","Rani","Full Stack Developer"));
        Map<String, Long>emp= emplist.stream().collect(Collectors.groupingBy(Ex->Ex.getName(),Collectors.counting()));
        System.out.println("Count The Name Occurence:" + emp);


    }
}
