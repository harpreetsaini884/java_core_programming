import java.util.HashSet;
import java.util.Random;

public class OTPGenerator {
    public static void main(String[] args) {
        HashSet<Integer> otpSet = new HashSet<>();
        Random rand = new Random();

        // Generate 10 unique OTPs
        for (int i = 0; i < 10; i++) {
            int otp = generateOTP(rand);
            while (otpSet.contains(otp)) {
                otp = generateOTP(rand); // Ensure OTP is unique
            }
            otpSet.add(otp);
            System.out.println("OTP " + (i + 1) + ": " + otp);
        }
    }

    public static int generateOTP(Random rand) {
        return 100000 + rand.nextInt(900000); // Generate a 6-digit OTP
    }
}
