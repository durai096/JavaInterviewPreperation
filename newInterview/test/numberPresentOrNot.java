package JavaCommonQA.newInterview.test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class numberPresentOrNot {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int toFound=3;
        boolean fount=false;
        for (int number:arr1 ){
            if (number==toFound){
                fount=true;

            }
        }
        if (fount){
            System.out.println("Present ");
        }else {
            System.out.println("Not Found");
        }

    }
}
