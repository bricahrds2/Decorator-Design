public class BorderDecorator extends Decorator {
    public void draw() {
        super.draw();
        System.out.println("BorderDecorator");
    }

    public BorderDecorator(Widget widget) {
        super(widget);
    }
}