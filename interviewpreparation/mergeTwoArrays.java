package JavaCommonQA.interviewpreparation;

import java.util.ArrayList;
import java.util.List;

public class mergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1={1,3,2,5,4};
        int[] arr2={9,10,6,7,8};
        List<Integer>list=new ArrayList<>();
        int [] mergeArray=new int[arr1.length+arr2.length];
        for (int i=0;i<arr1.length;i++){
            mergeArray[i]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            mergeArray[arr1.length+i]=arr2[i];
        }
        for (int com:mergeArray){
            list.add(com);
            //System.out.println(com);
        }
        System.out.println(list);
    }
}
