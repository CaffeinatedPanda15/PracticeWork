package za.ac.cput.util;


import javax.naming.AuthenticationNotSupportedException;

public class Helper {

    public static String generateId() {
        return java.util.UUID.randomUUID().toString();
    }

    public static boolean isNullorEmpty (String s) {
        if (s.isEmpty() || s == null)
            return true;
        return false;
    }

    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }

}//end of class
