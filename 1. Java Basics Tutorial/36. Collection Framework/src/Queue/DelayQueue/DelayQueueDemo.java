package Queue.DelayQueue;

import java.util.concurrent.DelayQueue;

public class DelayQueueDemo {
    public static void main(String[] args) throws InterruptedException {

        DelayQueue<OTP> queue = new DelayQueue<>();

        System.out.println("Adding OTPs...");
        queue.put(new OTP("1111", 5));
        queue.put(new OTP("2222", 10));

        while (true) {
            OTP otp = queue.take();
            System.out.println("Expired OTP: " + otp.getOtp()
                    + " at " + System.currentTimeMillis());
        }

    }
}
