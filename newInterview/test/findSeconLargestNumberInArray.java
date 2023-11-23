package JavaCommonQA.newInterview.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class findSeconLargestNumberInArray {
    int [] number={20,30,10,100,90,3,2};
    public static void main(String[] args) {
        findSeconLargestNumberInArray findSeconLargestNumberInArray=new findSeconLargestNumberInArray();
        findSeconLargestNumberInArray.usingCollectionsMethod();
        findSeconLargestNumberInArray.shiftingElements();
    }
    public void usingCollectionsMethod(){
        List<Integer>list=new ArrayList<>();
        for (int value:number){
            list.add(value);
        }
        Collections.sort(list);
        System.out.println("First Largest Number is: "+list.get(list.size()-1));
        System.out.println("Second Largest Number is: "+list.get(list.size()-2));
        System.out.println("First SmallestNumber is: "+list.get(0));
        System.out.println("Second SmallestNumber is: "+list.get(1));
    }
    public void shiftingElements(){
        int temp=0;
        for (int i=0;i<number.length;i++){
            for(int j=i+1;j<number.length;j++){
                if (number[i]>number[j]){
                    temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }
        System.out.println("Arranged Array: "+Arrays.toString(number));
        System.out.println("Second Largest Number is: "+number[number.length-2]);
    }
}
