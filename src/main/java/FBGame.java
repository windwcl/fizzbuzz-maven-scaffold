/**
 * Created by clwen
 * Date 2018/3/28 0:53
 * Description
 */
public class FBGame {
    public String play(int i) {
        if(0==i%3&&0==i%5){
            return "fizzbuzz";
        }
        if(0==i%3){
            return "fizz";
        }
        if(0==i%5){
            return "buzz";
        }
        return String.valueOf(i);
    }
}
