import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMood_whenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad message");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void givenMood_whenNotSad_ShouldReturnHappy(){
        MoodAnalyser moodAnalyserT = new MoodAnalyser("This is a happy message");
        String mood = moodAnalyserT.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenMood_whenNotNull_ShouldReturnHappy(){
        MoodAnalyser moodAnalyserT = new MoodAnalyser(null);
        String mood = moodAnalyserT.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}