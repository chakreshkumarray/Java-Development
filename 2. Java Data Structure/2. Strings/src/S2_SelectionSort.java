public class S2_SelectionSort {
    public static void main(String[] args) {

        String[] name = {"Ambreesh","Dheeraj","Shivam","Anil","Shubham"};

        for (int i = 0; i < name.length; i++){

            int minIndex = i;

            for (int j = i + 1; j < name.length; j++){

                if (name[j].compareTo(name[minIndex])<0){
                    minIndex = j;
                }
            }
            String temp = name[i];
            name[i] = name[minIndex];
            name[minIndex] = temp;
        }
        for (String i : name){
            System.out.println(i);
        }
    }
}
