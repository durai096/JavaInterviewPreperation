package JavaCommonQA.interviewpreparation;

public class CountNumberOfVowels {
    public static void main(String[] args) {
        String str="Java Love";
        str.replaceAll("\\p{Zs}","");
        int count=0;
        char[] charArray=str.toCharArray();
        for (int i=0;i<charArray.length;i++){
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
