package JavaCommonQA.interviewpreparation.AmbiguidProblem;

public interface A {
    void method_A();
}
interface B{
    void method_B();
}
class C implements A,B{

    @Override
    public void method_A() {
        System.out.println("This is method A");
    }

    @Override
    public void method_B() {
        System.out.println("This is method B");
    }

    public static void main(String[] args) {
        C c=new C();
        c.method_A();
        c.method_B();
    }
}
