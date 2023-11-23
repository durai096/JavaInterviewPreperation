package JavaCommonQA.newInterview.String;

import java.util.*;

public class RemovingDuplicatesArray {
    public static void main(String[] args) {
        int [] arr={2,1,2,3,4,3};
        List<Integer>list=new ArrayList<>();
        for (int value:arr){
           list.add(value);
        }
        System.out.println("Before Remove Duplicates: "+list);
        Set<Integer>set=new LinkedHashSet<>();
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    set.add(arr[i]);
                }
            }
        }
        System.out.println("After Removing Duplicates: "+set);
    }
}
