package JavaCommonQA.interviewpreparation;

public class arrangeIndexWise {
    public static void main(String[] args) {
        String str="Raja";
        String output="";
        int [] index={3,1,2,0};//aajR
        for (int i=0;i<index.length;i++){
            int k=index[i];
            char charArray=str.charAt(k);
            output=output+charArray;
        }
        System.out.println(output);
    }
}
