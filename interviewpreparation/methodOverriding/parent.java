package JavaCommonQA.interviewpreparation.methodOverriding;

public class parent {
    void run() {
        System.out.println("This is parent");
    }
}
    class child extends parent{
        @Override
        void run(){
            System.out.println("This is child");
        }



        public static void main(String[] args) {
            child c=new child();
            c.run();
            parent p=new parent();
            p.run();
        }


}

