public class A1_AccessArray {
    public static void main(String[] args) {

        // array size fixed
        // store in heap
        // array is object
        // store similar type of data
        // super class of array is object
        // store multiple value
        // array is very fast compare to primitive data type
        // because primitive data type use wrapper claas for internal conversion
        // can't increase or decrease size of array at run time
        // store object directly of class
        // slow speed when delete element from middle need to traverse whole array

        int[] arr = new int[100];  // declaration size
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int[] a = new int[0];
        int[] b = new int[-3]; // Error -> NegativeArraySizeException
    }
}
