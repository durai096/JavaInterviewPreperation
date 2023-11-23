package JavaCommonQA.interviewpreparation;

public class CountCharInString {
    public static void main(String[] args) {
        String str="Raja";
        char[] charArray=str.toCharArray();

        boolean[] isPresent=new boolean[str.length()];
        for (int i=0;i<str.length();i++){
            if (!isPresent[i]){
                int count=1;
                for (int j=i+1;j<str.length();j++){
                    if (charArray[i]==charArray[j]){
                        isPresent[j]=true;
                        count++;

                    }
                }
                if (!isPresent[i]){
                    isPresent[i]=true;
                    System.out.print(charArray[i]+" "+ count);
                }

            }
        }


        }


    }

