package JavaCommonQA.newInterview.test;

public class firstRepetingCharacterIndex {
    public static void main(String[] args) {
        String str="abcacdece";
       int s= isFirstnonRepeat(str);
        System.out.println(s);

    }
    public static int isFirstnonRepeat(String str){
        char[]charArray=  str.toCharArray();
        for (int i=0;i<charArray.length;i++){
            for (int j=i+1;i<charArray.length;j++){
                if (charArray[i]==charArray[j]){
                   return i;

                }

            }
        }
        return -1;
    }
}
