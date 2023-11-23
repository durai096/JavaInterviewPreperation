package JavaCommonQA;

import java.util.Arrays;
import java.util.stream.Collectors;

public class intersection2 {
    public static void main(String[] args) {
        int [] firstArray={2,2,1,4,3,6,7,8};
        int [] secondArray={2,3,9,2,7};
        Arrays.stream(firstArray).filter(first->Arrays.stream(secondArray).anyMatch(second->second==first)).distinct().forEach(System.out::println);
    }
}
