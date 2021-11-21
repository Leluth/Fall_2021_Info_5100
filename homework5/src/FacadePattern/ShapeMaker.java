package FacadePattern;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: ShapeMaker
 * @date 2021/11/21 10:54
 */
public class ShapeMaker {
    private final Shape circle;
    private final Shape rectangle;
    private final Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
