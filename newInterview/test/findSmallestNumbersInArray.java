package JavaCommonQA.newInterview.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class findSmallestNumbersInArray {
    Integer[] arr={5,2,3,1,4};
    public void usingArrayMethod(){
        Arrays.sort(arr);
        System.out.println("usingArrayMethod: "+arr[0]);
        System.out.println("getMaxValue: "+arr[arr.length-1]);
    }
    public void usingCollections(){
        List<Integer>list=Arrays.asList(arr);
       Collections.sort(list);
        System.out.println("usingCollections: "+list.get(0));
        System.out.println("maxValueOf: "+list.get(list.size()-1));
    }public void usingOwnLogic(){
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("usingOwnLogic: "+smallest);
    }
    public void shiftingElement(){
        int temp=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        System.out.println("usingShiftingMethod: "+arr[0]);
    }
    public void usingStreams(){
       int getMinimumValue= Arrays.stream(arr).min((x1,x2)->x1-x2).get();
        System.out.println("usingStreams: "+getMinimumValue);
    }
    public static void main(String[] args) {
        findSmallestNumbersInArray findSmallestNumbersInArray=new findSmallestNumbersInArray();
        findSmallestNumbersInArray.usingArrayMethod();
        findSmallestNumbersInArray.usingCollections();
        findSmallestNumbersInArray.usingOwnLogic();
        findSmallestNumbersInArray.shiftingElement();
        findSmallestNumbersInArray.usingStreams();

    }
}
