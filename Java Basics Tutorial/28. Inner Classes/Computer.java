package Static_NestedClass;
public class Computer {

    private final String brand;
    private final String model;
    private final OperatingSystem os;

    public OperatingSystem getOs() {
        return os;
    }

    public Computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    // Nested Class
    static class USB{
        private final String type;

        public USB(String type) {
            this.type = type;
        }
        void displayInfo(){
            System.out.println("USB type : "+type);
        }

    }

   // Inner Class
    class OperatingSystem{

        private final String osName;

       public OperatingSystem(String osName) {
           this.osName = osName;
       }

       public void displayInfo(){
           System.out.println("Computer brand " + brand +
                   " model "+ model+" OS :" + osName);
       }
   }


}
