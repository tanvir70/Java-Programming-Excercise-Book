package book.StringJavaMathAPI;

public class StrongPasswordChecker {

    public static final int MIN_LOWERCASE = 1;
    public static final int MIN_UPPERCASE = 1;
    public static final int MIN_DIGITS = 1;
    public static final int MIN_SPECIAL = 1;
    public static final int MIN_LENGTH = 8;
    public static final int MAX_LENGTH = 16;


    public static boolean isValidPassword(String password) {

        if (password.length() < MIN_LENGTH || password.length() > MAX_LENGTH) {
            return false;
        }

        int lowercase = 0;
        int uppercase = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLowerCase(c)) {
                lowercase++;
            } else if (Character.isUpperCase(c)) {
                uppercase++;
            } else if (Character.isDigit(c)) {
                digits++;
            } else if (!Character.isLetterOrDigit(c)) {
                special++;
            }
        }

        return lowercase >= MIN_LOWERCASE
                && uppercase >= MIN_UPPERCASE
                && digits >= MIN_DIGITS
                && special >= MIN_SPECIAL;
    }

    public static void main(String[] args) {
        String pass = "Password#12";
        System.out.println(isValidPassword(pass));
    }

}
