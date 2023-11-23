package JavaCommonQA.newInterview.String;

public class reverseTheWord {
    public static void main(String[] args) {
        String str="Raja Love Rani";
        String reverse="";
        String[] stringArray=str.split(" ");
        for (int i=stringArray.length-1;i>=0;i--){
            reverse=reverse+stringArray[i]+" ";
        }
        System.out.println("The Reversed Word Is: "+reverse);
    }
}
