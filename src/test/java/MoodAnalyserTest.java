import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void whengivenNullMood_In_Object_should_throwException() {
        MoodAnalyser moodAnalyser2 = new MoodAnalyser(null);
        try {
            moodAnalyser2.analyseMood();
        } catch (InvalidMoodException e) {
            Assert.assertEquals(InvalidMoodException.ExceptionType.NULL_TYPE, e.type);
        }
    }
    @Test
    public void whengivenEmptyMood_In_Object_should_throwException () {
        MoodAnalyser moodAnalyser3 = new MoodAnalyser(" ");
        try {
            moodAnalyser3.analyseMood();
        } catch (InvalidMoodException e) {
            Assert.assertEquals(InvalidMoodException.ExceptionType.EMPTY_TYPE, e.type);
        }
    }
}