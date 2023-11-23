package JavaCommonQA;

import java.util.Random;
import java.util.Scanner;

public class printRandomNumbers {
    public static void main(String[] args) {
        int n=5;
//        System.out.println("Enter How Much Number You Want: ");
//        Scanner scanner=new Scanner(System.in);
//        int n = scanner.nextInt();
        Random random= new Random();
        random.ints(1,99).limit(n).forEach(System.out::println);

    }
}
