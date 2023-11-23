package JavaCommonQA.newInterview.test;

import java.util.Arrays;

public class AvrageOfArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
       double streamAverage= Arrays.stream(arr).average().orElse(0);
        System.out.println("Using Stream "+ streamAverage);
        double sum=0;
        for (int value:arr){
            sum=sum+value;
        }
        double average=sum/arr.length;
        System.out.println(average);

    }
}
