package JavaCommonQA.interviewpreparation;

public class printLongestWordInString {
    public static void main(String[] args) {
        String str="Raja is Rajadurai RajaduraiYuva";
        char[] charArray=str.toCharArray();
        //int count=charArray.length;
        int count=0;
        String longestWord="";
        String []stringArray=str.split("\\p{Zs}");

        for (String s:stringArray){
            if (s.length()>count){
                longestWord=s;
                count=s.length();
            }
        }
        System.out.println(longestWord);
    }


}
