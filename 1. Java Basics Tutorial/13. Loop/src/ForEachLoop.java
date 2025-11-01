public class ForEachLoop{
  public static void main(String[] args){
    //Declare and initialize an array of integers
    int[] nums = {1,2,3,4,5};

    // For-each loop to iterate through each element in the array 
    // "i" will take the value of each element one by one
    for(int i:nums){
      // Printing the current value of "i"
      System.out.println(i);
    }
  }
}
