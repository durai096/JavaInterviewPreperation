package JavaCommonQA;

import java.util.LinkedHashMap;
import java.util.Map;

public class countEachCharToTheString {
    public static void main(String[] args) {
        String str="Raja is Raja";
       String [] SlpitChar=str.split(" ");
//      Map<String,Long>OccurenceCount= Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(occ->occ,Collectors.counting()));
        Map<String, Integer> map=new LinkedHashMap<>();
        for (String s:SlpitChar){
            if (map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }

        }
        for (Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
