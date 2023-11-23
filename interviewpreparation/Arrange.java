package JavaCommonQA.interviewpreparation;

public class Arrange {
    public static void main(String[] args) {
        String str="Raja";
        int []index={1,0,2,3};
        String output="";
        for (int i=0;i<index.length;i++){
            int k=index[i];
            char charvalue=str.charAt(k);
            output=output+charvalue;
        }
        System.out.println(output);
    }
}
