public class NotLetterException extends Exception{
    public NotLetterException(char letter) {
        super(letter + " is not a letter!");
    }
}
