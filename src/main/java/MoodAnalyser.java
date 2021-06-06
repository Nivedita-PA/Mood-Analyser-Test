public class MoodAnalyser {

    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(String message) {
        this.message = message;
        return message;
    }


    public String analyseMood() {
        if (message.contains("sad")) {
            return "SAD";
        } else {
            return "Happy";
        }
    }
}