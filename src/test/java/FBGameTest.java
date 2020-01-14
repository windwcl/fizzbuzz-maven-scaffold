import org.junit.Assert;
import org.junit.Test;

/**
 * Created by clwen
 * Date 2018/3/28 0:53
 * Description
 */
public class FBGameTest {
    @Test
    public void test(){
        FBGame fbGame = new FBGame();
        Assert.assertEquals("fizz",fbGame.play(3));
        Assert.assertEquals("buzz",fbGame.play(5));
        Assert.assertEquals("fizzbuzz",fbGame.play(15));
        Assert.assertEquals("4",fbGame.play(4));
    }
}
