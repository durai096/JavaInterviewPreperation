package JavaCommonQA;

import java.util.Arrays;
import java.util.List;

public class checkAnyListElementDivByTwo {
    public static void main(String[] args) {
        List<Integer> intList= Arrays.asList(2,4,10,12);
       boolean DivByTwo= intList.stream().allMatch(n->n%2==0);
       if (DivByTwo){
           System.out.println("All the element divided by 2");
       }else {
           System.out.println("All the element not divided by 2");
       }
    }
}
