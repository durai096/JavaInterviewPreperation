package JavaCommonQA.newInterview.test;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringReverse {
    String str="Raja";

    public static void main(String[] args) {
        StringReverse stringReverse=new StringReverse();
        stringReverse.usingCollection();
        stringReverse.usingStringBuffer();
        stringReverse.usingOwnLogic();
    }
    public void usingCollection(){
    List<Character> list=new ArrayList<>();
    for (Character s:str.toCharArray()){
        list.add(s);
    }
        Collections.reverse(list);
        System.out.println(list);
    }
    public void usingStreams(){
           char[] charArray= str.toCharArray();

    }
    public void usingStringBuffer(){
        StringBuffer sb=new StringBuffer();
        sb.append(str);
        System.out.println(sb.reverse());
    }
    public void usingOwnLogic(){
        char[] charArray=str.toCharArray();
        String reverse="";
        for (int i=charArray.length-1;i>=0;i--){
            reverse=reverse+charArray[i];
        }
        System.out.println(reverse);
    }

}
