package JavaCommonQA.newInterview.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pattrenProgram {
    public static void main(String[] args) {
        pattern();
        int [] arr={1,2,3,4,5};
        List<Integer> list=new ArrayList<>();
        for (int i=arr.length-1;i>=0;i--){
            list.add(arr[i]);


        }
        System.out.println(list);
        System.out.println(list.get(3));
    }
    public static void pattern(){
        for (int i=0;i<=5;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
