package JavaCommonQA.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class Cricket {
    public static void main(String[] args) {
        players p1=new players("Dhoni",41,"Male");
        players p2=new players("Kohli",35,"Male");
        players p3=new players("Mandhana",26,"Female");
        players p4=new players("MidhaliRaj",38,"Female");
        players p5=new players("Rohit",40,"Male");
        players p6=new players("Mandhana",26,"Female");
        List<players> playersList= Arrays.asList(p1,p2,p3,p4,p5,p6);
//        playersList.add(p1);
//        playersList.add(p2);
//        playersList.add(p3);
//        playersList.add(p4);
//        playersList.add(p5);
//        playersList.add(p6);
        List<String>sortAge=playersList.stream().filter(s->s.getAge()>35).map(s->s.getName()).collect(Collectors.toList());
//        sortAge.forEach(System.out::println);
        System.out.println("sortAge: "+sortAge);
       Map<String,List<players>>grouping= playersList.stream().collect(Collectors.groupingBy(players::getGender));
//        System.out.println("grouping: "+grouping);

        grouping.forEach((gender,playerList)->{
            System.out.println(gender);
            playerList.forEach(System.out::println);
//            System.out.println(players1);
        });
      Optional<String>minimumAge= playersList.stream()
              .min(Comparator.comparing(players::getAge))
              .map(players::getName);
        System.out.println("minimumAge: "+minimumAge);
        Map<String,Long>CountPlayersName=playersList.stream().collect(Collectors.groupingBy(s->s.name,Collectors.counting()));
        System.out.println("CountPlayersName: "+CountPlayersName);
        List<players>WithoutDuplicates=playersList.stream().distinct().collect(Collectors.toList());
        System.out.println("WithoutDuplicates: "+WithoutDuplicates);
        Set<String> set = new HashSet<>();
        List<players> duplicates = playersList.stream()
                .filter(s-> set.add(String.valueOf(s))) // Try to add to the set; if already present, it's a duplicate
                .collect(Collectors.toList());

        System.out.println("Duplicates: "+duplicates);
        List<players>SinglerPlayer=playersList.stream().filter(s->s.getName().equals("Dhoni")).collect(Collectors.toList());
//        System.out.println("SinglerPlayer: "+SinglerPlayer);
        SinglerPlayer.forEach(System.out::println);

    }
}
