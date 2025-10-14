package Interface;

public class Test {
    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.endCall();
        smartPhone.makeCall(5968526);

        smartPhone.PlayMusic();
        smartPhone.recordVideo();

        smartPhone.takePhoto();
        smartPhone.StopMusic();


    }
}
