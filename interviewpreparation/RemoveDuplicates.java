package JavaCommonQA.interviewpreparation;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={4,2,8,9,2,1,3,4,7,8};
        List<Integer>list=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            boolean isDuplicates=false;
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    isDuplicates=true;
                }

            }
            if (!isDuplicates){
                list.add(arr[i]);
                System.out.println(arr[i]);
            }
        }
        System.out.println(list);
    }
}
