/**
 * Created by helloqiu on 16/3/7.
 */
public class CalculateWorker {
    private float a, b, c;
    public CalculateWorker(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void calculate() throws Exception{
        if (b * b - 4 * a * c < 0) {
            Exception exception = new Exception("NoRealRoots");
            throw exception;
        }
        if (b * b - 4 * a * c == 0.f) {
            float ans = (float) (-b + Math.pow((b * b - 4 * a * c),0.5d))/2 * a;
            System.out.println("The Root is " + ans + ".");
            return;
        }
        float ans0 = (float) (-b + Math.pow((b * b - 4 * a * c),0.5d))/2 * a;
        float ans1 = (float) (-b - Math.pow((b * b - 4 * a * c),0.5d))/2 * a;
        System.out.println("The roots are " + ans0 + " and " + ans1 + ".");
    }
}
