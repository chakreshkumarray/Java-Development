public class S4_LinearSearch {
    public static void main(String[] args) {

        String[] name = {"Ambreesh","Dheeraj","Shivam","Anil","Shubham"};

        String item = "Ambreesh";
        int temp = 0;

        for (int i = 0; i < name.length; i++){
            if (name[i].equals(item)){
                System.out.println("Item present at "+ i+ " index position");
                temp++;
            }
        }
        if (temp == 0){
            System.out.println("Element not found in list");
        }
    }
}
