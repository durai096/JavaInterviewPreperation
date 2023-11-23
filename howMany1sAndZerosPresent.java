package JavaCommonQA;

import java.util.Arrays;
import java.util.List;

public class howMany1sAndZerosPresent {
    public static void main(String[] args) {
        List<Integer>arrayList= Arrays.asList(4,0,1,0,1,0,1,0,1);
        int sum=arrayList.stream().reduce(0,Integer::sum);
        System.out.println("The number of 1's: "+sum);
        System.out.println("The number of 0's: "+(arrayList.size() - sum));
    }
}
