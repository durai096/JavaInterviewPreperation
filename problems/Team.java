package JavaCommonQA.problems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Team {
    List<Player> players;
    public int getScore(){

          return players.stream().mapToInt(s->s.getScore()).sum();

    }
    public Map<String,List<Player>> getPlayersSkills(){
        Map<String,List<Player>>getPlayersSkill=players.stream().collect(Collectors.groupingBy(Player::getType));
        return getPlayersSkill;
    }
    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }





}
