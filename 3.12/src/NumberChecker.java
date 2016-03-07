/**
 * Created by helloqiu on 16/3/7.
 */
public class NumberChecker {
    int num;
    public NumberChecker(int num) {
        this.num = num;
    }
    public int check() {
        if (num % 30 == 0) {
            // Divisible both by 5 or 6
            return 0;
        }
        if (num % 5 == 0) {
            // Divisible by 5
            return 1;
        }
        if (num % 6 == 0) {
            //Divisible by 6
            return 1;
        }
        // not divisible by either 5 or 6
        return 2;
    }
}
