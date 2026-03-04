import java.util.ArrayList;

public class A21_EvenOdd {
    public static void main(String[] args) {

        int[] arr = {8, 5, 10, 12, 3, 1, 4};

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                arrayList.add(arr[i]);
            }else {
                array.add(arr[i]);
            }
        }
        System.out.println("Even number are");

        int temp1 = 0;
        for (int number: arrayList){
            temp1 = temp1 + number;
            System.out.print(number+" ");
        }
        System.out.print("\n");
        System.out.println("size of even number: "+arrayList.size());
        System.out.println("sum of even number: "+temp1);

        System.out.println("Odd number are");

        int temp2 = 0;
        for (int number: array){
            temp2= temp2 + number;
            System.out.print(number+" ");
        }
        System.out.println("\nsize of odd number: "+array.size());
        System.out.println("sum of odd number is: "+temp2);
    }
}
