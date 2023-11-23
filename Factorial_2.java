package JavaCommonQA;

public class Factorial_2 {
    public static void main(String[] args) {
        Factorial_2 factorial2=new Factorial_2();
        int result=factorial2.findFactorial(5);
        System.out.println(result);
    }
    public int findFactorial(int number){
        if (number==1){
            return 1;
        }else {
            return number*findFactorial(number-1);
        }

    }
}
