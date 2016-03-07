/**
 * Created by helloqiu on 16/3/7.
 */
public class DayWorker {
    private int day;
    private int year;
    private int month;
    public DayWorker(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        if (month == 1) {
            this.month = 13;
            this.year --;
        }
        if (month == 2) {
            this.month = 14;
            this.year --;
        }
    }
    public int work() {
        int tmp0 = day;
        int tmp1 = (int)(26*(month + 1)/10f);
        int tmp2 = year % 100;
        int tmp3 = (int)((year % 100) / 4f);
        int tmp4 = (int)(year / 100 / 4f);
        int tmp5 = 5 * year / 100;
        int h = tmp0 + tmp1 + tmp2 + tmp3 + tmp4 + tmp5;
        h = h % 7;
        return h;
    }
}
