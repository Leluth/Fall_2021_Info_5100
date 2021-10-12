/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Shape
 * @date 2021/10/3 10:11
 */
public class Shape {
    private String name;
    private String color;
    private Integer area;
    private Integer perimeter;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, int perimeter, int area) {
        this.name = name;
        this.color = color;
        this.perimeter = perimeter;
        this.area = area;
    }

    public String printShape() {
        assert name != null;
        assert color != null;
        StringBuilder sb = new StringBuilder();
        sb.append("The ");
        sb.append(name);
        sb.append(" has a ");
        sb.append(color);
        sb.append(" color");
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(Integer perimeter) {
        this.perimeter = perimeter;
    }
}
