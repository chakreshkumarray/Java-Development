package Queue.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class OTP implements Delayed {

    private final String otp;
    private final long expiryTime;

    public OTP(String otp, long delayInSeconds) {
        this.otp = otp;
        this.expiryTime =
                System.currentTimeMillis()
                        + TimeUnit.SECONDS.toMillis(delayInSeconds);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long remaining =
                expiryTime - System.currentTimeMillis();
        return unit.convert(remaining, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed other) {
        return Long.compare(
                this.getDelay(TimeUnit.MILLISECONDS),
                other.getDelay(TimeUnit.MILLISECONDS)
        );
    }

    public String getOtp() {
        return otp;
    }
}

