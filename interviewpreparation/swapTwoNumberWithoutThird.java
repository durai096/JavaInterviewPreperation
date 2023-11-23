package JavaCommonQA.interviewpreparation;

public class swapTwoNumberWithoutThird {
    public static void main(String[] args) {
        int firstNum=20;
        int secondNum=10;
        firstNum=firstNum-secondNum;
        secondNum=firstNum+secondNum;
        firstNum=secondNum-firstNum;
        System.out.println(firstNum+" "+secondNum);
    }

}
