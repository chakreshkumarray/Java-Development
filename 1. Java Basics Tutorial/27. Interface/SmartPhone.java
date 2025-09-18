package Multiple_Inheritance;

public class SmartPhone  implements MusicPlayer, Camera, Call{

    // Calling
    public void makeCall(int number){
        System.out.println("Calling Ck Ray");
    }
    public void endCall(){
        System.out.println("End the call from Aa..");
    }

    // Music Player
    public void PlayMusic(){
        System.out.println("Tu hai to dil dha dak ta h..");
    }
    public void StopMusic(){
        System.out.println("Stop the current song.");
    }

    // Camera
    public void takePhoto(){
        System.out.println("click a photo..");
    }
    public void recordVideo(){
        System.out.println("Record ths video..");
    }

}
