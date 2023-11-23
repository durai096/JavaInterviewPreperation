package JavaCommonQA;

import java.util.*;
import java.util.stream.Collectors;

public class employee {
    public static void main(String[] args) {
        List<Example1> emplist=new ArrayList<>();
        emplist.add(new Example1("AB123","Raja","Java Developer"));
        emplist.add(new Example1("AB124","Raja","Python Developer"));
        emplist.add(new Example1("AB125","yuva","Angular Developer"));
        emplist.add(new Example1("AB126","Rani","Full Stack Developer"));
//        Map<String,Integer>map=new HashMap<>();
//        for (Example1 e:emplist){
//            if (!map.containsKey(e.getName())){
//                map.put(e.getName(),1);
//            }else {
//                map.put(e.getName(),map.get(e.getName())+1);
//            }
//        }
//        System.out.println(map);
        Map<String, Long> map = emplist.stream()
                .collect(Collectors.groupingBy(Example1->Example1.getName(), Collectors.counting()));

        System.out.println(map);


    }

}
