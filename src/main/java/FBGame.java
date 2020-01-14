/**
 * Created by clwen
 * Date 2018/3/28 0:53
 * Description
 */
public class FBGame {
    public String play(int i) {
        String rslt = null;
        if (0 == i % 3 && 0 == i % 5) {
            rslt = "fizzbuzz";
        } else if (0 == i % 3) {
            rslt = "fizz";
        } else if (0 == i % 5) {
            rslt = "buzz";
        } else {
            rslt = String.valueOf(i);
        }
        return rslt;
    }
}
