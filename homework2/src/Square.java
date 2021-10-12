/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Rectangle
 * @date 2021/10/3 10:25
 */
public class Square extends Shape {
    private int side;

    public Square(int side) {
        super(null, null);
        this.side = side;
    }

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public Integer getArea() {
        return side * side;
    }

    @Override
    public Integer getPerimeter() {
        return 4 * side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
