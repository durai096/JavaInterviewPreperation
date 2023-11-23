package JavaCommonQA.interviewpreparation;

import java.util.*;
import java.util.stream.Stream;

public class combineTwoArrays {
    public static void main(String[] args) {
        int [] arr1={4,4,3,2,1,3,5};
        int [] arr2={8,7,6,8,6,10,9};
        List<Integer>list=new ArrayList<>();

       int [] combineArray=new int[arr1.length+arr2.length];
       for (int i=0;i<arr1.length;i++){
           combineArray[i]=arr1[i];
       }
       for (int i=0;i<arr2.length;i++){
           combineArray[arr1.length+i]=arr2[i];
       }
       for (int value:combineArray){
           list.add(value);
       }
        System.out.println("CombineArray: "+list);
       //Remove Duplicates
        Set<Integer>set=new TreeSet<>();
        for (int value:list){
            set.add(value);
        }
        System.out.println("SortAndRemoveDuplicates: "+set);
    }
}
