package JavaCommonQA.interviewpreparation;

public class sumAndAverage {
    public static void main(String[] args) {
        int [] arr={2,3,4,5};
        double sum=0;
        for (int value:arr){
            sum=sum+value;
        }
        double Average=sum/arr.length;
        System.out.println(Average);

    }
}
