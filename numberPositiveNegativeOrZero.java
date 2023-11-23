package JavaCommonQA;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class numberPositiveNegativeOrZero {
    public static void main(String[] args) {
        int count=0;
//        List<Integer> num= Arrays.asList(10,20,-10,-30);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        if (num>0){
            count++;
            System.out.println("Number is Positive "+count);

        } else if (num<0) {
            System.out.println("Number is Negative");

        }else {
            System.out.println("The Number is Zero");
        }
    }
}
