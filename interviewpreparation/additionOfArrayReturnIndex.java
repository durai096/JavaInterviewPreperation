package JavaCommonQA.interviewpreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class additionOfArrayReturnIndex {
    public static void main(String[] args) {
        int [] arr={2,3,4,5};
        int target=7;
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target){
                    list.add(i);
                    list.add(j);
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        System.out.println("Sum of 7 index is: "+list);
    }
}
