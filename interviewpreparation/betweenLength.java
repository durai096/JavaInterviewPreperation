package JavaCommonQA.interviewpreparation;

public class betweenLength {
    public static void main(String[] args) {
        String [] arr={"Raja","Rani","Durai","Raja"};
        int count=0;
        for (int i=0;i<arr.length;i++){
           for (int j=i+1;j< arr.length;j++){
               if (arr[i]==arr[j]){
                    count = arr[i].length()-arr[j].length();
               }
           }

        }
        System.out.println(count);
    }
}
