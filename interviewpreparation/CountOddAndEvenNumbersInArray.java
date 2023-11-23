package JavaCommonQA.interviewpreparation;

public class CountOddAndEvenNumbersInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,8,10};
        int Odd=0;
        int Even=0;
        for (int value:arr){
            if (value%2==0){
                Even++;
            }
            else {
                Odd++;
            }
        }
        System.out.println("Even Number Count: "+Even);
        System.out.println("Odd Number Count: "+Odd);
    }
}
