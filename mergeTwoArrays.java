package JavaCommonQA;

import java.util.Arrays;

public class mergeTwoArrays {
    public static void main(String[] args) {
        int[] array1={3,4,5,6,7,8};
        int[] array2={11,22,33,55,67};
        int[] finalArray=new int [array1.length+array2.length];
        System.arraycopy(array1,0,finalArray,0,array1.length);
        System.arraycopy(array2,0,finalArray,array1.length,array2.length);
        Arrays.sort(finalArray);
        //print new sorted array of
        System.out.println("Merged Array is: "+Arrays.toString(finalArray));
//        System.out.println(Arrays.stream(finalArray).count());
        //print sorted
        for (int element:finalArray){
            System.out.print(element  +" ");
//            System.out.println(Arrays.toString(element));
        }

    }
}
