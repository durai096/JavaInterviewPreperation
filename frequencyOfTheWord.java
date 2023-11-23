package JavaCommonQA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequencyOfTheWord {
    public static void main(String[] args) {
        String str="learning is an learning";
        String [] stringArray=str.split(" ");
        Map <String,Integer>map=new HashMap<>();
//        for (String s:stringArray){
//           if (map.containsKey(s)){
//               map.put(s,map.get(s)+1);
//           }else{
//               map.put(s,1);
//           }
//
//        }
//        for (Map.Entry entry:map.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }


      Map<String,Long>frequency= Arrays.stream(str.split("\\p{Zs}"))
                .collect(Collectors.groupingBy(s-> s,Collectors.counting()));
        System.out.println("Frequency Of The Word Is: "+frequency);
    }

}
