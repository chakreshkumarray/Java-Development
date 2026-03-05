import java.util.ArrayList;

public class A24_CommonElementThreeArray {
    public static void main(String[] args) {

        // Find Common Element in Three Array
        int[] arr1 = {2, 4, 8};
        int[] arr2 = {2, 3, 4, 8, 10, 16};
        int[] arr3 = {2, 8, 14, 20};

        int x = 0, y = 0, z = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while ( x < arr1.length && y < arr2.length && z < arr3.length){
            if (arr1[x] == arr2[y] && arr2[y] == arr3[z]){
             list.add(arr1[x]);
             x++;
             y++;
             z++;
            } else if (arr1[x] < arr2[y]) {
                x++;
            } else if (arr2[y] < arr3[z]) {
                y++;
            }else {
                z++;
            }
        }
        for (int i : list){
            System.out.println(i);
        }
    }
}
