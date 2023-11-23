package JavaCommonQA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AssendingAndDesendingUsingJava8 {
    public static void main(String[] args) {
//        int [] numbers={2,6,8,9,1,3,8,12};
//        List<Integer> Assending=new ArrayList<>();
//        for (int value:numbers){
//            Assending.add(value);
//        }
        List<Integer>Assending=Arrays.asList(2,6,8,9,1,3,8,12,12);

     List<Integer>AssendingOrder=  Assending.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println("Asseding Order is: "+AssendingOrder);

        List<Integer>DesdingOrder= Assending.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("Desending Order is: "+DesdingOrder);
    }
}
