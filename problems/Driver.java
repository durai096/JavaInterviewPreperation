package JavaCommonQA.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {
        Player p1=new Player("Dhoni",5000,"Batsman");
        Player p2=new Player("Kholi",55000,"Batsman");
        Player p3=new Player("Bumbhara",1000,"Bowler");
        Player p4=new Player("Sami",100,"Bowler");
        List<Player> playerList=new ArrayList<>();
        playerList.add(p1);
        playerList.add(p2);
        playerList.add(p3);
        playerList.add(p4);
        Team india=new Team();
        india.setPlayers(playerList);
        int totalScore= india.getScore();
        System.out.println(totalScore);

        Map<String,List<Player>>getSkill=india.getPlayersSkills();
        System.out.println(getSkill);
    }
}
