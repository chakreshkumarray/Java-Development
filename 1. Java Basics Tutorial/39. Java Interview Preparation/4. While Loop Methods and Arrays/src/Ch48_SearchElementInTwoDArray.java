public class Ch48_SearchElementInTwoDArray {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int key = 50;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Element " + key + " found at position: (" + i + "," + j + ")");
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        if (!found) {
            System.out.println("Element " + key + " not found in array");
        }
    }
}

