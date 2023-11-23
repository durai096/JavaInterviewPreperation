package JavaCommonQA;

import java.util.Arrays;

public class additionOfTwoArrays {
    public static void main(String[] args) {
        int[] a = {0, 1, 2};
        int[] b = {3, 4, 5};
//        int [] sum=Arrays.stream(a).flatMap(first->Arrays.stream(b).map(second->second+first)).toArray();
       int [] sum= Arrays.stream(a).flatMap(first->Arrays.stream(b).map(second->second+first)).toArray();
        System.out.println(Arrays.toString(sum));
//        int[] c = new int[a.length];
//        if(a.length==b.length) {
//            for (int i = 0 ,j=0,k=0; i < a.length; i++,j++,k++) {
//                c[k] = a[i] + b[j];
//
//                System.out.println((c[k]));
//
//            }}
//        else {
//            System.out.println("Should be same length in two arrays");

        }
    }

