package Question1Solution;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Fiction
 * @date 2021/10/26 18:53
 */
public class NonFiction extends Book implements iBorrowable{
    private int borrowDay;
    private int returnDay;

    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
        borrowDay = -1;
        returnDay = -1;
    }

    @Override
    String description() {
        return getTitle() + "(title) all events are true and based on real facts.";
    }

    @Override
    public void setBorrowDate(int day) {
        borrowDay = day;
    }

    @Override
    public void setReturnDate(int day) {
        returnDay = day;
    }

    @Override
    public boolean isAvailable(int day) {
        return day < borrowDay || day > returnDay;
    }
}
