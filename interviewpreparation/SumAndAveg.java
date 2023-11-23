package JavaCommonQA.interviewpreparation;

public class SumAndAveg {
    public static void main(String[] args) {
        int [] number={2,3,4,5,6};
        double sum=0;
        for (int s:number){
            sum=sum+s;
        }
        double Average=sum/number.length;
        System.out.println(Average);
    }
}
