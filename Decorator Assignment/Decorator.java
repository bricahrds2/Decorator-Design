public class Decorator implements Widget {
    Widget widget;

    public Decorator(Widget widget) {
        this.widget = widget;
    }

    public void draw() {
        widget.draw();
    }
}