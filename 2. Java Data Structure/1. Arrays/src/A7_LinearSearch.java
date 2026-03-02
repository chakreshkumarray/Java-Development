public class A7_LinearSearch {
    public static void main(String[] args) {

        int[] arr = {78, 96, 51, 28, 63, 21};

        int item = 78;
        int temp = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == item){
                System.out.println("Item present at "+ i+ " index position");
                temp++;
            }
        }
        if (temp == 0){
            System.out.println("Element not found in list");
        }

    }
}
