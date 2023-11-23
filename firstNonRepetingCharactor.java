package JavaCommonQA;

public class firstNonRepetingCharactor {
    public static void main(String[] args) {
        String str="Rajadurai";
        for (Character ch:str.toCharArray()){
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                System.out.println("First Non Repeating Character: "+ch);
                break;
            }
        }
    }
}
