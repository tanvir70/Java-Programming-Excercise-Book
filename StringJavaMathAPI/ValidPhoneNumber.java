package book.StringJavaMathAPI;

public class ValidPhoneNumber {
    public static void main(String[] args) {
        String phoneNumber = "01796631527";

        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("Phone number is valid.");
        } else {
            System.out.println("Phone number is not valid.");
        }
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) return false;
        if (phoneNumber.charAt(0) != '0') return false;
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (!Character.isDigit(phoneNumber.charAt(i))) return false;
        }
        return true;
    }
}
