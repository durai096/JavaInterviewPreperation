package JavaCommonQA;

public class printNumber1To100WithoutusingLoop {
    public static void main(String[] args) {
        printNumber(1);
    }
    public static void printNumber(int n){
        if (n<=100){
            System.out.println(n);
            printNumber(n+1);
        }
    }
}
