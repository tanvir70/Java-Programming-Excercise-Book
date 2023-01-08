package book.ExceptionHandeling;

public class ExceptionTest {

    public static void main(String[] args)
            throws Exception {
        try {
            methodA();
            doNotCallMe();
            methodB();
        } catch (XyzException ex) {
        } catch (Exception e) {
            throw e;
        } finally {
            System.out.println("Inside finally block");
        }
        System.out.println("End of the main method");
    }

    public static void methodA() {
        System.out.println("Inside method A");
    }

    public static void methodB() throws XyzException {
        System.out.println("Inside method B");
        throw new XyzException();
    }

    public static void doNotCallMe() throws Exception {
        throw new Exception("You can't call this method!");
    }
}

class XyzException extends Exception {
}


