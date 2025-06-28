public class Student {
    /** String name;  // instance variable
     int age;
     int rollNumber;
     */

    // If you want to private this instance variable use private
    private String name;
    private int age;
    private int rollNumber;
    private String study;
    private String branch;

    // Setter Method to initialize the value
    public  void  setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age < 0){
            System.out.println("Invalid age..");
        }else {
            this.age = age;
        }
    }

    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public void setStudy(String study){
        this.study = study;
    }

    public void setBranch(String branch){
        this.branch = branch;
    }

    // Getter Method to access ths value
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getRollNumber(){
        return rollNumber;
    }

    public String getStudy(){
        return study;
    }

    public String getBranch(){
        return branch;
    }

}
