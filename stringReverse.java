package JavaCommonQA;

import java.util.*;
import java.util.stream.Collectors;

public class stringReverse {
    public static void main(String[] args) {
        String str="Raja";
        Set<Character>set=new HashSet<>();
        for (Character c :str.toCharArray()){
            set.add(c);
//        for (int i=0;i<str.length();i++){
//            for (int j=i+1;j<str.length();j++){
//                set.add(str.charAt(i));
//            }

        }
        System.out.println(set);
//        str.toLowerCase();
//        Map<Character,Integer>map=new HashMap<>();
//        for (Character s:str.toCharArray()){
//            if (map.containsKey(s)){
//                map.put(s,map.get(s)+1);
//            }else{
//                map.put(s,1);
//            }
//        }
//        for (Map.Entry entry :map.entrySet()){
//            System.out.println(entry.getKey()+" "+ entry.getValue());
//        }
//        str.replaceAll("\\p{Zs}","");
//        Map<String,Long>Occurence=Arrays.stream(str.split("")).collect(Collectors.groupingBy(s->s,Collectors.counting()));
//        System.out.println(Occurence);
//        char[] charArray=str.toCharArray();
//        for (int i=0;i<charArray.length;i++){
//            for (int j=i+1;j<charArray.length;j++){
//                char temp=0;
//                if (charArray[i]>charArray[j]){
//                    temp=charArray[i];
//                    charArray[i]=charArray[j];
//                    charArray[j]=temp;
//                }
//            }
//
//        }
//        String reverse="";
//        String [] stringArray=str.split(" ");
//        for (int i=stringArray.length-1;i>=0;i--){
//            reverse=reverse+stringArray[i]+" ";
//        }
//        char [] charArray=str.toCharArray();
//        for (int i=charArray.length-1;i>=0;i--){
//            reverse=reverse+charArray[i];
//
//        }

//        System.out.println(charArray);
    }
}
