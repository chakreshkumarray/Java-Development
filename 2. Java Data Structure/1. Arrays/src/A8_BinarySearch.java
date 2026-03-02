public class A8_BinarySearch {
    public static void main(String[] args) {
        /*
        A divide-and-conquer algorithm used to find a target value in a sorted array.
        It repeatedly halves the search space until the target is found or the search space is empty.

        Time complexity: 𝑂(log𝑛)
        Space complexity:𝑂(1)
        Step-by-Step Example
        Let’s search for 7 in the sorted array:[1, 3, 5, 7, 9, 11]

        Initial Array: [1, 3, 5, 7, 9, 11]
        Left index = 0, Right index = 5
        Middle index =(0+5)/2=2→ element = 5

        Compare Target (7) with Middle (5)
        7 > 5 → search the right half [7, 9, 11]

        New Search Space: [7, 9, 11]
        Left index = 3, Right index = 5
        Middle index =(3+5)/2=4 → element = 9

        Compare Target (7) with Middle (9)
        7 < 9 → search the left half [7]

        New Search Space:
        [7] Left index = 3, Right index = 3

        Middle index = 3 → element = 7
        Target Found! Index = 3
         */

        int[] arr = {2, 5, 7, 9, 12, 14, 16, 17, 19, 20, 24, 28};
        int search = 16;
        int li = 0;
        int hi = arr.length - 1;
        int mi = (li + hi) / 2;

        while (li <= hi) {
            if (arr[mi] == search) {
                System.out.println("Element is at " + mi + " index position");
                break;
            } else if (arr[mi] < search) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = (li + hi) / 2;
        }
        if (li > hi){
            System.out.println("Element not found");
        }

    }
}
