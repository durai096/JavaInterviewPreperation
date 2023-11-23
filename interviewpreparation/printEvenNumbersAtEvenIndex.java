package JavaCommonQA.interviewpreparation;

public class printEvenNumbersAtEvenIndex {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,10};
        for (int i=0;i<arr.length;i++){
            if (i%2==0 && arr[i]%2==0){
                System.out.println(arr[i]);

            }
        }
    }
}
