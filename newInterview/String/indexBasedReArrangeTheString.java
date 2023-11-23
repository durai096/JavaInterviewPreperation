package JavaCommonQA.newInterview.String;

public class indexBasedReArrangeTheString {
    public static void main(String[] args) {
        String str="Raja love Rani";
        String outPut="";
        char temp=0;
        int [] index={13,3,2,0,4,5,6,7,8,9,10,11,12,1};

        for (int i=0;i<index.length;i++){
            int k=index[i];
            temp=str.charAt(k);
            outPut=outPut+temp;

        }
        //2103->jaRa
//        for (int i=0;i<str.length();i++){
//            char temp=0;
//            int k = index[i];
//            temp=str.charAt(k);
//            outPut=outPut+temp;
//
//        }
        System.out.println(outPut);

    }

}
