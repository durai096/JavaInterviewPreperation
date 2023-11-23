package JavaCommonQA.interviewpreparation.Interface;

public interface parent {
    void run();
}
class child implements parent{

    @Override
    public void run() {
        System.out.println("Interface method running");
    }

    public static void main(String[] args) {
        child c=new child();
        c.run();
    }
}
