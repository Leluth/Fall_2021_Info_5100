package Question1Solution;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Reference
 * @date 2021/10/26 18:59
 */
public class Reference extends Book{
    private String category;

    public Reference(String title, double price, String publishYear, String category) {
        super(title, price, publishYear);
        this.category = category;
    }

    @Override
    String description() {
        return getTitle() + "(title) all information is real.";
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
