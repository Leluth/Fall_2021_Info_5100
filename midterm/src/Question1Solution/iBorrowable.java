package Question1Solution;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: iBorrowable
 * @date 2021/10/26 18:51
 */
public interface iBorrowable {
    void setBorrowDate(int day);
    void setReturnDate(int day);
    boolean isAvailable(int day);
}
