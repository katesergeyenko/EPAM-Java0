public class NotCharException extends Exception {
    public NotCharException(String string) {
        super("\"" + string + "\" is not a char!");
    }
}
