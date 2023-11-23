package JavaCommonQA;

import java.util.Arrays;

public class largestNumberFirst {
    public static void main(String[] args) {
        int [] numbers={8,6,0,4,6,4,2,7,10};
        for (int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                if (numbers[i]<numbers[j]){
                    int temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        String result="";
        for (int i=0;i<numbers.length;i++){
            result=result+numbers[i];
        }
        System.out.println(result);
    }
}
