package JavaCommonQA;

public class FactorialNumbersUsingRecurison {
    public static void main(String[] args) {
        int n = 6;
        int calculatate=calculatate(n);
        System.out.println(calculatate);
    }

    public static int calculatate(int n) {
        if (n == 1) {
            return 1;
        }
        else{
            return n * calculatate(n - 1);
        }

    }

}
