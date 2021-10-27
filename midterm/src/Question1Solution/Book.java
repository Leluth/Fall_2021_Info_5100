package Question1Solution;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Book
 * @date 2021/10/26 18:42
 */
public abstract class Book {
    private String title;
    private double price;
    private String publishYear;

    public Book(String title, double price, String publishYear) {
        this.title = title;
        this.price = price;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    abstract String description();
}
