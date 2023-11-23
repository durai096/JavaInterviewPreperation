package JavaCommonQA.Java8;

import java.util.LinkedHashSet;
import java.util.Set;

public class findDuplicates {
    public static void main(String[] args) {
        int [] arr={1,2,1,3,4,3};
        Set<Integer>set=new LinkedHashSet<>();
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    set.add(arr[i]);
                }
            }
        }
        System.out.println(set);
    }
}
