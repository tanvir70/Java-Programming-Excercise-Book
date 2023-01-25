package book.StringJavaMathAPI;

public class EmailValidator {
    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }


        // Check for a single '@' character
        int atIndex = email.indexOf('@');
        if (atIndex == -1 || atIndex == 0
                || atIndex == email.length() - 1) {
            return false;
        }

        for (int i = 0; i < atIndex; i++) {
            char c = email.charAt(i);
            if (!Character.isLetterOrDigit(c)
                    && c != '.' && c != '_' && c != '-') {
                return false;
            }
        }



        if (!email.substring(atIndex).contains(".")) {
            return false;
        }


        return true;
    }


    public static void main(String[] args) {
        String email = "user@example.com";
        if (isValidEmail(email)) {
            System.out.println("The email '"
                    + email + "' is valid.");
        } else {
            System.out.println("The email '"
                    + email + "' is not valid.");
        }
    }

}
