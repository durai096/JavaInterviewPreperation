package JavaCommonQA.interviewpreparation.AbstractClass;

public abstract class parent {
    abstract void run();
}
class child extends parent{
    @Override
    void run(){
        System.out.println("Abstract method running");
    }

    public static void main(String[] args) {
       child c=new child();
       c.run();
    }
}
