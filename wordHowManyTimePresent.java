package JavaCommonQA;

public class wordHowManyTimePresent {
    public static void main(String[] args) {
        String str="Raja is Raja";
        String toFound="Raja";
        int count=0;
        String[] temp=str.split(" ");
        for (int i=0;i<temp.length;i++){
                if (toFound.equals(temp[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
