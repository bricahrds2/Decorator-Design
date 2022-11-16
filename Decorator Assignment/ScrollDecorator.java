public class ScrollDecorator extends Decorator {
    public void draw() {
        super.draw();
        System.out.println("ScrollDecorator");
    }

    public ScrollDecorator(Widget widget) {
        super(widget);
    }
}