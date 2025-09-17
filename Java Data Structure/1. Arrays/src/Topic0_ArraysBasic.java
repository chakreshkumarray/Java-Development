public class Topic0_ArraysBasic {
    public static void main(String[] args) {

        // type[] variableName;
        int[] a = {2, 3, 8, 9}; // initialization
        System.out.println(a);  // wrong methods

        // access array
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        // access array by for loop
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // Stored in Heap Memory
        int[] arr = new int[10];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        //  Traversing an Array
        int[] array = new int[10];
        array[3] = 55;
        array[7] = 23;
        for (int i = 1; i < 10; i++){
            System.out.println(array[i]);
        }

        // Traversing Methods with length
        int[] array1 = new int[20];
        array1[3] = 20;
        array1[7] = 54;
        System.out.println(array1.length);
        for (int i = 1; i < array1.length; i++){
            System.out.println(array1[i]);
        }

        // Arrays Methods
        int [] arr1={2,7,9,3,6,4};
        System.out.println(arr); // not able to access

        // Access by for loop
        for (int i = 0; i < arr1.length;i++){
            System.out.println(arr1[i]);
        }

        // Array Traversal by Another type of loop
        int[] array2 = {15,20,35,57,65,71};
        for (int i : array2) {
            System.out.println(i);
        }

        // Find Maximum Element

        int[] arr3={16,25,51,77,80,45,39};
        int result=0;
        for (int i=0; i<arr3.length;i++){
            if(arr3[i]>result){
                result=arr3[i];

            }
        }
        System.out.println(result);

        // If Given negative value

        int[] arr4={-16,-25,-51,-77,-80,-45,-39};
        int result1=Integer.MIN_VALUE;
        for (int i=0; i<arr4.length;i++){
            if(arr4[i]>result1){
                result1=arr4[i];
            }
        }
        System.out.println(result1);
    }
}