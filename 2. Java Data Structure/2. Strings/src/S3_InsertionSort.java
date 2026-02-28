public class S3_InsertionSort {
    public static void main(String[] args) {

        String[] name = {"Ambreesh","Dheeraj","Shivam","Anil","Shubham"};

        String temp;
        int j;
        for (int i = 0; i < name.length; i++){
            temp = name[i];
            j = i;
            while (j > 0 && name[j - 1].compareTo(temp) > 0){
                name[j] = name[j - 1];
                j = j - 1;
            }
            name[j] = temp;
        }
        for (String i: name){
            System.out.println(i);
        }
    }
}
