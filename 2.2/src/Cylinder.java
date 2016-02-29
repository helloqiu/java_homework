/**
 * Created by helloqiu on 16/2/29.
 */
public class Cylinder {
    private float radius = 0.f;
    private float height = 0.f;
    public Cylinder (float radius, float height) {
        this.radius = radius;
        this.height = height;
    }
    public float getArea() {
        return (float)(radius * radius * Math.PI);
    }
    public float getVolume() {
        return (float)(this.getArea() * height);
    }
}
