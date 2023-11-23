package JavaCommonQA.interviewpreparation;

public class countPasitiveNegativeAndZeros {
    public static void main(String[] args) {
        int [] arr={1,2,3,-1,-2,-3,0,0,0};
        int p=0,n=0,z=0;
        for (int i:arr){
            if (i<0){
                p++;
            } else if (i>0) {
                n++;
            }
            else {
                z++;
            }

        }
        System.out.println("Positive count: "+p);
        System.out.println("Negative count: "+n);
        System.out.println("Zeros count: "+z);
    }
}
