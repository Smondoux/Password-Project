package password.project;
import java.security.SecureRandom;

public class PasswordGen {
    public String generatePassword() {
        // Character arrays
        char[] letters = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z'
        };

        char[] specialChars = {
            '!', '@', '#', '$', '%', '^', '&', '*',
        };

        SecureRandom rand = new SecureRandom();

        // Generates new password with 8 characters, 4 numbers, and 3 special chars
        String newPassword = "";
        for (int j = 0; j < 15; j++) {
            if (j < 8) {
                newPassword += letters[rand.nextInt(52)];
            } else if (j >= 8 & j < 12) {
                newPassword += Integer.toString(rand.nextInt(10)); // Note that bound is exclusive. rand.nextInt(9) -> 0-8, not 0-9
            } else {
                newPassword += (specialChars[rand.nextInt(8)]);
            }
        }
        return newPassword;
    }
}