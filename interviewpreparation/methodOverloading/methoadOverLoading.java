package JavaCommonQA.interviewpreparation.methodOverloading;

public class methoadOverLoading {
    public int add(int a,int b){


        return a+b;
    }
    public  double add(double a,double b){

        return a+b;
    }

    public static void main(String[] args) {
        methoadOverLoading ml=new methoadOverLoading();
        System.out.println(ml.add(10,20));
        System.out.println(ml.add(10.0,20.0));

    }
}
