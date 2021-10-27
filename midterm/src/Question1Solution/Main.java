package Question1Solution;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Main
 * @date 2021/10/26 19:46
 */
public class Main {
    public static void main(String[] args) {
        Fiction fiction = new Fiction("Frankenstein", 4.4, "1997");
        NonFiction nonFiction = new NonFiction("Anne Frank", 8.8, "1999");
        Reference reference = new Reference("World Maps", 4.88, "2020", "dictionaries");
        System.out.println(fiction.description());
        System.out.println(fiction.isAvailable(0));
        System.out.println(fiction.getPrice());
        System.out.println(nonFiction.description());
        nonFiction.setBorrowDate(0);
        nonFiction.setReturnDate(4);
        System.out.println(nonFiction.isAvailable(2));
        System.out.println(nonFiction.isAvailable(8));
        System.out.println(reference.description());
        System.out.println(reference.getCategory());
        reference.setCategory("encyclopedia");
        System.out.println(reference.getCategory());
    }
}
