package JavaCommonQA.interviewpreparation;

import java.util.LinkedHashMap;
import java.util.Map;

public class countTheWord {
    public static void main(String[] args) {
        String str="Raja is Raja";
        String[] stringArray=str.split(" ");
        Map<String,Integer>map=new LinkedHashMap<>();
        for (String c :stringArray){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }

        }
        for (Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

}
