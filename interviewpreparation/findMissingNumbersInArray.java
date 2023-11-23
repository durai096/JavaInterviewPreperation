package JavaCommonQA.interviewpreparation;

public class findMissingNumbersInArray {
    public static void main(String[] args) {
        int[] arr={2,3,5,1,6,7};
        int sum1=0,sum2=0;
        for (int i=1;i<=7;i++){
            sum1=sum1+i;
        }
        System.out.println(sum1);
        for (int i=0;i<arr.length;i++){
            sum2=sum2+arr[i];
        }
        System.out.println(sum2);
        int m=sum1-sum2;
        System.out.println("Missing Number is: "+m);
    }
}
