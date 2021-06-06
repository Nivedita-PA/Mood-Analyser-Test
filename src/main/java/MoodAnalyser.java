public class MoodAnalyser {

    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(String message) {
        this.message = message;
        return message;
    }


    public String analyseMood() throws InvalidMoodException {
        try{
        if(message.length() == 0)
            throw new InvalidMoodException(InvalidMoodException.ExceptionType.EMPTY_TYPE, "Please don't" +
                    "leave the message empty");
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }         catch (Exception e){
            throw new InvalidMoodException(InvalidMoodException.ExceptionType.NULL_TYPE, "Please" +
                    "enter valid message");
            }
        }
    }
