package za.ac.cput.util;


import javax.naming.AuthenticationNotSupportedException;

public class Helper {
    public static boolean isNullorEmpty (String s) {
        if (s.isEmpty() || s == null)
            return true;
        return false;
    }

    public static boolean isValidEmail(String email) {
      throw new UnsupportedOperationException();
    }

}//end of class
