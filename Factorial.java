package JavaCommonQA;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial= new Factorial();
       int result= factorial.findFact5(5);
        System.out.println(result);

    }
    public int findFact5(int no){
        return no*findFact4(no-1);

    }

    public int findFact4(int no) {
        return no*findFact3(no-1);
    }

    public int findFact3(int no) {
        return no*findFact2(no-1);
    }

    private int findFact2(int no) {
        return no*findFact1(no-1);
    }

    private int findFact1(int no) {
        return 1;
    }
}
