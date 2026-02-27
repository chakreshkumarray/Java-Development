public class A2_BubbleSort_ForString {
    public static void main(String[] args) {

        String[] name = {"Ambreesh","Dheeraj","Shivam","Anil","Shubham"};

        for (int i = 0; i < name.length; i++){
            int flag = 0;
            for (int j = 0; j < name.length - 1 - i; j++){
                if (name[j].compareTo(name[j + 1]) > 0){ // ASCII Lexicographically value check
                    String temp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0){
                break;
            }
        }

        for (String i : name){
            System.out.println(i);
        }
    }
}
