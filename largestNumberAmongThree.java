package JavaCommonQA;

public class largestNumberAmongThree {
    public static void main(String[] args) {
        largest(1,2,3);

    }
    public static void largest(int a,int b,int c){
        int largest=Math.max(Math.max(a,b),c);
        System.out.println(largest);
    }
}
