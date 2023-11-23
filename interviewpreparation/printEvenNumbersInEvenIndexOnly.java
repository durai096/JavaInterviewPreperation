package JavaCommonQA.interviewpreparation;

public class printEvenNumbersInEvenIndexOnly {
    public static void main(String[] args) {
        int [] arr={1,2,3,5,7,8,10,9};
        for (int i=0;i<arr.length;i++){
            if (i%2==0 && arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
