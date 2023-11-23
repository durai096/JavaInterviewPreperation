package JavaCommonQA;

import java.util.Arrays;
import java.util.List;

public class arrayElementPositiveOrNagativeAndCount {
    public static void main(String[] args) {
            int []array={10,20,50,-20,-40};
            int []positiveArray=new int[10];
            int [] negativeArray=new int[10];
            int positiveCount=0;
            int negativeCount=0;
            for (int i=0;i<array.length;i++){
                if (array[i]>0){
                    positiveArray [positiveCount] = array[i];
                    positiveCount++;
                }else{
                    negativeArray [negativeCount]= array[i];
                    negativeCount++;
                }
            }
        System.out.println("Total Positive: "+positiveCount);
        System.out.println("Total Negative: "+negativeCount);

    }
}
