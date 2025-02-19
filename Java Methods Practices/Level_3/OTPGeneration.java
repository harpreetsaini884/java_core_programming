import java.util.HashSet;
import java.util.Random;

public class OTPGeneration {
    public static void main(String[] args) {
        int numberOfOtpGenerations = 10;
        HashSet<String> otpSet = new HashSet<>();

        System.out.println("Generated OTPs:");
        for (int i = 0; i < numberOfOtpGenerations; i++) {
            String otp = generateOTP();
            otpSet.add(otp);
            System.out.println("OTP " + (i + 1) + ": " + otp);
        }

        if (otpSet.size() == numberOfOtpGenerations) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are repeated.");
        }
    }

    public static String generateOTP() {
        Random random = new Random();
        StringBuilder otp = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            otp.append(random.nextInt(10)); 
        }

        return otp.toString();
    }
}
