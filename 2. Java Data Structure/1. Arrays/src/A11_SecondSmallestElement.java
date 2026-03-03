public class A11_SecondSmallestElement {
    public static void main(String[] args) {

        // Find second-smallest element
        int[] arr = {6, 8, 2, 4, 3, 1, 5, 7};

        for(int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                int temp;
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second Smallest Number is : "+arr[1]);
    }
}
