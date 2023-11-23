package JavaCommonQA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithNumberArray {
    public static void main(String[] args) {
        int [] arr={99,55,11,12,22,10};
        List<Integer>list=new ArrayList<>();
        for (int value :arr){
            list.add(value);
        }
        System.out.println("Before Start With '1' : "+ list);
       List<Integer>StartWith1= list.stream()
               .map(s->s+"")//convert integer to string
               .filter(s->s.startsWith("1"))//find start with 1
               .map(Integer::valueOf)//convert string to integer
               .collect(Collectors.toList());
        System.out.println("After Start With '1' : "+ StartWith1);
    }

}
