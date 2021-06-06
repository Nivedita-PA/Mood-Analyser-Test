public class InvalidMoodException extends Exception{
    enum ExceptionType{
        NULL_TYPE,EMPTY_TYPE;
    }
    ExceptionType type;
    String message;
    public InvalidMoodException(ExceptionType type, String message){
        super(message);
        this.message = message;
        this.type = type;
    }
}
