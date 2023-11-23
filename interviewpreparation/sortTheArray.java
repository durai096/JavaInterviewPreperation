package JavaCommonQA.interviewpreparation;

public class sortTheArray {
    public static void main(String[] args) {
        int[] arr={4,2,8,9,2,1,3,4,7,8};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println("Sorted Array Is: "+arr[i]);
        }



    }
}
