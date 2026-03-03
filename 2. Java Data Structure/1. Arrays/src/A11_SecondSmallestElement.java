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

        // Other Method
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < secondSmallest && arr[i] != smallest){
                secondSmallest = arr[i];
            }
        }
        if (secondSmallest == Integer.MAX_VALUE){
            System.out.println("There is no second smallest element in the list..");
        }
        else {
            System.out.println("Second Smallest Element : " + secondSmallest);
        }
    }
}
