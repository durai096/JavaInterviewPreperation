package JavaCommonQA;
import java.util.Arrays;
public class InterSection {
    public static void main(String[] args) {
        int [] firstArray={1,2,3,4};
        int [] secondArray={2,3,1};
       Arrays.stream(firstArray).filter(first->Arrays.stream(secondArray).anyMatch(second->second==first)).distinct().forEach(System.out::println);

    }
}
