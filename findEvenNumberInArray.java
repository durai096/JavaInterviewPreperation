package JavaCommonQA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findEvenNumberInArray {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7};
        List<Integer>list=new ArrayList<>();
        for (int i:array){
            list.add(i);
        }
      List<Integer>collect=  list.stream().filter(s->s%2==0).collect(Collectors.toList());
        System.out.println(collect);
    }
}
