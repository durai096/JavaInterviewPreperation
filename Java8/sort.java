package JavaCommonQA.Java8;

import java.util.*;

public class sort {
    public static void main(String[] args) {
        int[] num={4,3,5,6,2,3,1};
        int temp=0;
        List<Integer> list=new ArrayList<>();
        for (int value:num){
            list.add(value);
        }
        System.out.println("Before sorting: "+list);
//        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            for (int j=i+1;j<list.size();j++){
                if (num[i]>num[j]){
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }

        System.out.println("After sorting: "+Arrays.toString(num));

    }
}
