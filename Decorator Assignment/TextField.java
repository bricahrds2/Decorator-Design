public class TextField implements Widget {
    private int width;
    private int height;

    public TextField(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("The width is: " + width + " and the height is: " + height);
    }
}