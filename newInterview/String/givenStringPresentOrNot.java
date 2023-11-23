package JavaCommonQA.newInterview.String;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class givenStringPresentOrNot {
    public static void main(String[] args) {
        String str="Raja is Raja";
        Map<Character,Integer>map=new LinkedHashMap<>();
        for (Character c:str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
            for (Map.Entry entry : map.entrySet()) {
                System.out.println("Using Map Find Count Character: " + entry.getKey() + " " + entry.getValue());
            }
        }
        Long countWord= Arrays.stream(str.split(" ")).filter(s->s.equals("Raja")).collect(Collectors.counting());
        System.out.println("using Streams Method: "+countWord);
       Map<String,Long>CountWords= Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(s->s,Collectors.counting()));
        System.out.println("CountWords UsingStreams: "+CountWords);
        char toFound='R';
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==toFound){
                count++;
            }
        }
        System.out.println("Count is: "+count);
    }
}
