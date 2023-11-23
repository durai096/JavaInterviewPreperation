package JavaCommonQA.interviewpreparation;

public class addTwoArraysInThirdArray {
    public static void main(String[] args) {
        int []arr1={1,2,3};
        int[] arr2={4,5,6};
        int [] arr3=new int[arr1.length];
        for (int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i]+arr2[i];
            System.out.println(arr3[i]);

        }
    }
}
