package JavaCommonQA.interviewpreparation;

public class SearchElementsFromArray {
    public static void main(String[] args) {
        int [] arr={3,2,4,5};
        int search=53;
        boolean isPresent=false;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==search){
                isPresent=true;
            }
        }
        if (isPresent){
            System.out.println("Element Found");
        }else {
            System.out.println("Element Not Found");
        }
    }
}
