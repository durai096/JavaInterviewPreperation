package JavaCommonQA.newInterview.test;

import java.util.ArrayList;
import java.util.List;

public class sumOfTwoNumbers {
    public static void main(String[] args) {
        int[] arr={10,5,1,3};
        int output=4;
        List<Integer>list=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==output){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        System.out.println(list);

    }
}
