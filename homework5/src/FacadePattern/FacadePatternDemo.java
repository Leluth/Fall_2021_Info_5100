package FacadePattern;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: FacadePatternDemo
 * @date 2021/11/21 10:55
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
