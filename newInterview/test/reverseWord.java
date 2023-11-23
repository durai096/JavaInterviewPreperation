package JavaCommonQA.newInterview.test;

import java.util.Collections;

public class reverseWord {
    String word="Raja Love Rani";
    String reverse="";
    String[] charString=word.split(" ");
    public static void main(String[] args) {
        reverseWord reverseword= new reverseWord();
        reverseword.usingOwnLogic();
        reverseword.usingStringBuffer();
    }
    public void usingOwnLogic(){
        for (int i=charString.length-1;i>=0;i--){
            reverse=reverse+charString[i]+" ";
        }
        System.out.println("UsingOwnLogic: "+reverse);

    }
    public void usingStringBuffer(){
        StringBuffer sb=new StringBuffer();
        sb.append(charString);
        System.out.println(sb.reverse());
    }
}
