package JavaCommonQA.interviewpreparation;

public class countCharactorInString {
    public static void main(String[] args) {
        String str="Raja is Rajadurai";
       String stringSpaceRemove= str.replaceAll("\\p{Zs}","");
       char[] charArray=stringSpaceRemove.toCharArray();
        System.out.println(charArray.length);
    }
}
