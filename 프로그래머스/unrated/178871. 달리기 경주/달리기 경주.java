import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> ranks = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            ranks.put(players[i], i);
        }

        // i : 변수
        for (int i=0; i<callings.length; i++) {

            // j : 등수
            int rank = ranks.get(callings[i]);

            String forePlayer = players[rank-1];
            ranks.replace(players[rank], rank-1);
            ranks.replace(forePlayer, rank);

            players[rank - 1] = players[rank];
            players[rank] = forePlayer;

        }

        return players;
    }
}