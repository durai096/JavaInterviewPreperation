package JavaCommonQA.interviewpreparation;

public class printPrimeNumbers {
    public static void main(String[] args) {
       int number=10;
        //boolean isPrime=false;
        for (int i=2;i<=10;i++){
            boolean isPrime=true;
            for (int j=2;j<i;j++){
                if (i %j ==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i);
            }
        }

    }
}
