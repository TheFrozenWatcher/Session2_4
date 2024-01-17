package ThucHanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThucHanh1 {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)+$";

    public void EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

}

class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)+$";

    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String args[]) {
        emailExample = new EmailExample();

        System.out.println("Testing valid emails:");
        for (String email : validEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }

        System.out.println("\nTesting invalid emails:");
        for (String email : invalidEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
    }
}

