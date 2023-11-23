package JavaCommonQA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfTheArrayAndAdd {
    public static void main(String[] args) {
        List<Integer>arryList= Arrays.asList(10,20,30,40,50);
       int sum= arryList.stream().reduce(0,Integer::sum);
        System.out.println("Sum Is:"+sum);
       List<Integer>TransformList= arryList.stream().map(x->x+sum).collect(Collectors.toList());
        System.out.println(TransformList);
    }
}
