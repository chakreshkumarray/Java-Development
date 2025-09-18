import java.util.HashMap;
import java.util.Map;

public class Topic15_LC_2260_MinimumConsecutiveCardsPickUp {
    public static void main(String[] args) {
        System.out.println(MinimumCardPickup(new  int[] {3,4,2,3,4,7}));
        System.out.println(MinimumCardPickup(new int[] {1,0,5,3}));
    }

    public static int MinimumCardPickup(int[] cards){

        Map<Integer,Integer> map = new HashMap<>();
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < cards.length; i++){
            if(map.containsKey(cards[i])){
                res = Math.min(res, i - map.get(cards[i]) + 1);
            }
            map.put(cards[i], i);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

}
