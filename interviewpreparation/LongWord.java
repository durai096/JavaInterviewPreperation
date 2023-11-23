package JavaCommonQA.interviewpreparation;

public class LongWord {
    public static void main(String[] args) {
        String str="Raja is Rajadurai";
        int count=0;
        String longestWord="";
        String[] stringArray=str.split("\\p{Zs}");
        for (String s:stringArray){
            longestWord=s;
            count=s.length();
        }
        System.out.println(longestWord);
    }
}
