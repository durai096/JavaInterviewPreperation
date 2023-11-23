package JavaCommonQA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findTheEvenNUmbersAndSqure {
    public static void main(String[] args) {
//        int [] array={1,2,3,4,5};
        List<Integer>list=Arrays.asList(1,2,3,4,5);
        List<Integer>EvenNumberSquare=list.stream().filter(num->num%2==0).map(num->num*num).collect(Collectors.toList());
        System.out.println("Even Numbers Square: "+EvenNumberSquare);
        List<Integer>OddNumberSquare= list.stream().filter(num->num%2!=0).map(num->num*num).collect(Collectors.toList());
        System.out.println("Odd Numbers Square: "+OddNumberSquare);
    }
}
