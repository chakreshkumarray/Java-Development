import java.util.ArrayList;
import java.util.List;

public class Topic5_LC_2824_CountPairsWhoseSumIsLessThanTarget {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        num.add(-1);
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(1);
        System.out.println(CountPairs(num,2));
    }

    public static int CountPairs(List<Integer> nums , int target){
        int res = 0;
        for (int i = 0; i < nums.size(); i++){
            for (int j = i+1; j < nums.size(); j++){
                if (nums.get(i) + nums.get(j) < target){
                    res++ ;
                }
            }
        }
        return res;
    }

}
