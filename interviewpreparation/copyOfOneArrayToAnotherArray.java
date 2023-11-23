package JavaCommonQA.interviewpreparation;

import java.util.Arrays;

public class copyOfOneArrayToAnotherArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        int [] arr2=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                arr2[j]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
