package JavaCommonQA.newInterview;

import java.util.*;

public class stringReverse {
    String str="Raja is Rani";
    String[] word=str.split(" ");
    public void usingStringBuffer(){
        StringBuffer sb=new StringBuffer();
        sb.append(str);
        System.out.println("Using StringBuffer: "+sb.reverse());
    }
    public void usingCollections(){
        List<String> list=new ArrayList<>();
        for (String c:word){
            list.add(c);
        }
        Collections.reverse(list);
        System.out.println("Using Collections: "+list);


    }
    public void usingOwnLogic(){
        String reverse="";
        char[] charArray= str.toCharArray();
        for (int i=word.length-1;i>=0;i--){
            reverse=reverse+word[i]+ " ";
        }
        System.out.println("Using Own Logic: "+reverse);
    }
    public static void main(String[] args) {
        stringReverse stringReverse=new stringReverse();
        stringReverse.usingStringBuffer();
        stringReverse.usingCollections();
        stringReverse.usingOwnLogic();
    }
}
