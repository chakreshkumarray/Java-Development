import java.util.*;

public class Topic20_LC_2225_FindPlayersWithZeroOrOneLosses {
    public static void main(String[] args) {
        System.out.println(findWinners(new int[][] {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},
                {10,4},{10,9}}));
    }

    public static List<List<Integer>> findWinners(int[][] matches){
        List<Integer> zeroLosses = new ArrayList<>();
        List<Integer> oneLose = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int[] team : matches){
            map.put(team[0],map.getOrDefault(team[0],0) + 0);
            map.put(team[1],map.getOrDefault(team[1],0) + 1);
        }

        for(int i : map.keySet()){
            if(map.get(i) == 0){
                zeroLosses.add(i);
            }else if(map.get(i) == 1){
                oneLose.add(i);
            }
        }

        Collections.sort(zeroLosses);
        Collections.sort(oneLose);
        return Arrays.asList(zeroLosses,oneLose);
    }
}