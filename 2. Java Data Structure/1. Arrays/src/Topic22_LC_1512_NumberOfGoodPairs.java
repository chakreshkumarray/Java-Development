public class Topic22_LC_1512_NumberOfGoodPairs {
    public static void main(String[] args) {

        System.out.println(numIdenticalPairs(new int[] {1,2,3,1,1,3}));
        System.out.println(numIdenticalPairs(new int[] {1,1,1,1}));
    }


    public static int numIdenticalPairs(int[] nums){

        int res = 0;
        int[] countArray = new int[101];

        for (int num : nums){
            countArray[num]++;
        }

        for (int count : countArray){
            count = count * (count - 1) / 2;
            res += count;
        }
        return res;
    }
}
