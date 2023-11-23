package JavaCommonQA.interviewpreparation;

import java.util.ArrayList;
import java.util.List;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        String reverse="";
        List<Integer>list=new ArrayList<>();
        for (int i=arr.length-1;i>=0;i--){
            list.add(arr[i]);
            reverse=reverse+arr[i];
        }
        System.out.println(list);
        System.out.println("Reversed Array: "+reverse);
    }
}
