package JavaCommonQA;

import java.util.Arrays;

public class moveAllNegativeToBegningInArray {
    //move all negative numbers in beginning
    public static void main(String[] args) {
        int [] inputArray={1,-2,3,-1,4,-3};
        for (int i=0;i<inputArray.length;i++){
            for (int j=i+1;j<inputArray.length;j++){
                if (inputArray[i]>inputArray[j]){
                    int temp=inputArray[i];
                    inputArray[i]=inputArray[j];
                    inputArray[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(inputArray));
    }
}
