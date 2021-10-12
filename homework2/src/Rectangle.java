/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Rectangle
 * @date 2021/10/3 10:25
 */
public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int side) {
        super(null, null);
        this.width = side;
        this.height = side;
    }

    public Rectangle(int width, int height) {
        super(null, null);
        this.width = width;
        this.height = height;
    }

    public Rectangle(String name, String color, int width, int height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public Integer getArea() {
        return width * height;
    }

    @Override
    public Integer getPerimeter() {
        return 2 * (width + height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
