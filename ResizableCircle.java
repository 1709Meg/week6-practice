public class ResizableCircle extends Circle2 implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public double resize(int percent) {
        radius = radius * (percent / 100);
        return radius;
    }

}
