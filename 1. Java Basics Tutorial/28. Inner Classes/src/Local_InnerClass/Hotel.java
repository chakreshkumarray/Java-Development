package Local_InnerClass;

public class Hotel {

    private final String name;
    private final int room;
    private int reserved;

    public  Hotel(String name ,int room, int reserved){
        this.name = name;
        this.room = room;
        this.reserved = reserved;
    }

    public void reserveRoom(String guestName , int noOfRoom){
        class reservationValidator{
            boolean validate(){
                if(guestName == null || guestName.isBlank()){
                    System.out.println("Guest name can not be empty.");
                    return false;
                }
                if (noOfRoom < 0){
                    System.out.println("Number of room should be positive");
                    return false;
                }
                if (reserved + noOfRoom > room){
                    System.out.println("not enough room available.");
                    return false;
                }
                return true;
            }
        }

        reservationValidator Validator = new reservationValidator();
        if(Validator.validate()){
            reserved = reserved+noOfRoom;
            System.out.println("Reservation confirmed for "+ guestName +" for "+ noOfRoom + " rooms.");
        }else {
            System.out.println("Reservation failed..");
        }

    }


}
