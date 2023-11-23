package JavaCommonQA.newInterview.String;

public class countCharactorOwnlogic {
    public static void main(String[] args) {
        String str="Raja";
        char targetchar='1';
        int count=countCharactor(str,targetchar);
        System.out.println(targetchar+""+count);
    }
    public static int countCharactor(String s,Character targetChar ){
        int count =0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==targetChar){
                count++;
            }
        }
        return count;
    }
}
