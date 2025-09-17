 public class Array {
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
        int[] arr=new int[10];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        //  Traversing an Array
        int[] array=new int[10];
        array[3]=55;
        array[7]=23;
        for (int i=1;i<10;i++){
            System.out.println(array[i]);
        }

       // Traversing Methods with length
        int[] array1=new int[20];
        array1[3]=20;
        array1[7]=54;
        System.out.println(array1.length);
        for (int i=1;i<array1.length;i++){
            System.out.println(array1[i]);
        }

    }
}
